package com.commitcombo.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;

import com.commitcombo.service.externalApi.GithubApi;
import com.commitcombo.domain.User;
import com.commitcombo.repository.UserRepository;

@Service
@Slf4j
public class UserFactory{
	
	private GithubApi githubApi;
	private UserRepository userRepository;
	
	public UserFactory(){}
	
	@Autowired
	public UserFactory(GithubApi githubApi, UserRepository userRepository){
		this.githubApi = githubApi;
		this.userRepository = userRepository;
	}
	
	public User getUser(String userName){
		log.info(userName + " setting info...");
		User user = userRepository.findByUserName(userName);
		if(user == null){
			user = new User();
			log.info("Hello World!!");
		} 
		user.setUserName(userName);
		setContributionCount(user);
		log.info("Success contribution mapping : " + user.getContributionCount());
		setRank(user);
		return user;
	}
	
	@Transactional(readOnly = true)
	private void setContributionCount(User user){
		User finded = userRepository.findByUserName(user.getUserName());
		if(finded == null) finded = user;
		// DB에 저장된 유저가 없거나 최신상태가 아닌경우에만 githubApi호출
		if(finded.getLastModifiedDate() != null && 
		   finded.getLastModifiedDate().toString().equals(LocalDate.now().toString())){
			log.info("this user was overlapped");
			return;
		}
		log.info("-- github API --");
		user.setLastModifiedDate(LocalDate.now());
		user.setContributionCount(githubApi.getContributionCount(user.getUserName()));
	}
	
	@Transactional(readOnly = true)
	private void setRank(User user){
		List<User> users = userRepository.findAllWithSort();
		if(users.isEmpty()){
			user.setRank(1);
			return;
		}
		long rank = 1;
		for(User iter : users){
			if(iter.getUserName() == user.getUserName()) continue;
			if(iter.getContributionCount() < user.getContributionCount()){
				user.setRank(rank);
				return;
			}
			rank++;
		}
		user.setRank(rank);
	}
	
}
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
		log.info(userName + " 유저정보 세팅 시작 ...");
		User user = userRepository.findByUserName(userName);
		if(user == null){
			user = new User();
			log.info("신규 유저");
		} 
		user.setUserName(userName);
		setContributionCount(user);
		log.info("유저 contribution 매핑 성공 : " + user.getContributionCount());
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
			log.info("오늘 중복 업데이트 되는 유저");
			return;
		}
		log.info("신규 유저이거나 Date값이 최신이 아님");
		log.info("깃 허브 API 호출");
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
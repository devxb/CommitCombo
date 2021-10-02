package com.commitcombo.service;

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
		User user = userRepository.findByUserName(userName);
		if(user == null) user = new User();
		user.setUserName(userName);
		setContributionCount(user);
		setRank(user);
		return user;
	}
	
	@Transactional(readOnly = true)
	private void setContributionCount(User user){
		User finded = userRepository.findByUserName(user.getUserName());
		if(finded == null) finded = user;
		// DB에 저장된 유저가 없거나 최신상태가 아닌경우에만 githubApi호출
		if(finded.getLastModifiedDate() != null
			&& 
		   finded.getLastModifiedDate().toString().equals(LocalDate.now().toString())) return; 
		user.setLastModifiedDate(LocalDate.now());
		user.setContributionCount(githubApi.getContributionCount(user.getUserName()));
	}
	
	@Transactional(readOnly = true)
	private void setRank(User user){
		List<User> users = userRepository.findAllWithSort();
		for(User iter : users){
			if(iter.getContributionCount() > user.getContributionCount()){
				user.setRank(iter.getRank()+1);
				return;
			}
		}
		user.setRank((long)users.size()+1L);
	}
	
}
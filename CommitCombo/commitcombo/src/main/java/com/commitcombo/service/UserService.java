package com.commitcombo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.commitcombo.repository.UserRepository;
import com.commitcombo.domain.User;

import java.time.LocalDate;

@Service
@Transactional
public class UserService{
	
	private UserRepository userRepository;
	private UserFactory userFactory;
	
	@Autowired
	public UserService(UserRepository userRepository, UserFactory userFactory){
		this.userRepository = userRepository;
		this.userFactory = userFactory;
	}
	
	public String saveUser(User user){
		userRepository.save(user);
		return user.getUserName();
	}
	
	public String saveUserByUserName(String userName){
		User user = userFactory.getUser(userName);
		saveUser(user);
		return user.getUserName();
	}
	
	public User findUser(User user){
		return findUserByUserName(user.getUserName());
	}
	
	public User findUserByUserName(String userName){
		User ret = userRepository.findByUserName(userName);
		if(ret == null){
			ret = new User();
			ret.setUserName("InvalidUser");
			ret.setContributionCount(-1L);
			ret.setRank(-1);
			ret.setLastModifiedDate(LocalDate.now());
		}
		return ret;
	}
	
}
package com.commitcombo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import com.commitcombo.domain.User;
import com.commitcombo.repository.UserRepository;

@SpringBootTest
@Transactional
public class UserServiceTest{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserFactory userFactory;
	
	@Test
	public void 유저_저장_조회_테스트(){
		
		// Given
		User Devxb = userFactory.getUser("Devxb");
		
		// When
		userRepository.save(Devxb);
		User finded = userRepository.findByUserName("Devxb").orElse(null);
		
		// Then
		assertEquals(Devxb, finded);
		
	}
	
}
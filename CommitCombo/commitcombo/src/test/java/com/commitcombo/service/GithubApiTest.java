package com.commitcombo.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.commitcombo.service.externalApi.GithubApi;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GithubApiTest{
	
	@Autowired
	private GithubApi githubApi;
	
	@Test
	public void 깃허브_api_조회_성공_테스트(){
		
		// Given
		String userName = "Devxb";
		//String userName2 = "asdkfnaskdf";
		// When
		long DevxbcontributionCount = githubApi.getContributionCount(userName);
		//long asdkfnaskdfcontributionCount = githubApi.getContributionCount(userName2);
		// Then
		assertEquals(DevxbcontributionCount, 2);
		//assertEquals(asdkfnaskdfcontributionCount, 0);
	}
	
	@Test
	public void 깃허브_api_조회_실패_테스트(){
		// Given
		String userName2 = "asdkfnaskdf";
		
		// When
		long asdkfnaskdfcontributionCount = githubApi.getContributionCount(userName2);
		
		// Then
		assertEquals(asdkfnaskdfcontributionCount, -1);
	}
	
}
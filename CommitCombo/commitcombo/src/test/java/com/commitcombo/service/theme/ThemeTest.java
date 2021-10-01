package com.commitcombo.service.theme;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ThemeTest{
	
	@Autowired
	private ThemeFactory themeFactory;
	
	@Test
	public void 테마_생성_테스트(){
		
		// Given
		String t1 = "DeepOcean-mini";
		String t2 = "BasicWhite-mini";
		String t3 = "MintChocolate-mini";
		String t4 = "Rainbow-mini";
		String t5 = "Pink-mini";
		String t6 = "RoyalPink-mini";
		
		// When
		Theme c1 = themeFactory.getTheme(t1);
		Theme c2 = themeFactory.getTheme(t2);
		Theme c3 = themeFactory.getTheme(t3);
		Theme c4 = themeFactory.getTheme(t4);
		Theme c5 = themeFactory.getTheme(t5);
		Theme c6 = themeFactory.getTheme(t6);
		
		// Then
		assertTrue(t1.contains(c1.getThemeName()));
		assertTrue(t2.contains(c2.getThemeName()));
		assertTrue(t3.contains(c3.getThemeName()));
		assertTrue(t4.contains(c4.getThemeName()));
		assertTrue(t5.contains(c5.getThemeName()));
		assertTrue(t6.contains(c6.getThemeName()));
	}
	
}
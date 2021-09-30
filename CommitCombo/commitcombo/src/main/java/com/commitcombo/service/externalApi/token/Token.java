package com.commitcombo.service.externalApi.token;

import org.springframework.stereotype.Component;

@Component
public abstract class Token{
	
	public abstract String getToken();
	
}
package com.commitcombo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.commitcombo.interceptor.ResponseInterceptor;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new ResponseInterceptor()).addPathPatterns("/get", "/norank/get", "/box/get");
	}
	
}
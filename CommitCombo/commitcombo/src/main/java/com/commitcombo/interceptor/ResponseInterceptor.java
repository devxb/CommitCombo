package com.commitcombo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class ResponseInterceptor implements HandlerInterceptor{
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Connection", "keep-alive");
		response.setHeader("keep-alive", "time-out=10, max=5");
		
	}
	
}
package com.commitcombo.controller;

import lombok.extern.slf4j.Slf4j;

import com.commitcombo.service.errors.InvalidUserException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
public class ExceptionController{
	
	public static class ExceptionWrapper{
		
		private final String msg;
		
		private ExceptionWrapper(Builder builder){
			this.msg = builder.msg;
		}
		
		public String getMsg(){
			return this.msg;
		}
		
		private static class Builder{
			
			private String msg;
			
			public Builder msg(String msg){
				this.msg = msg;
				return this;
			}
			
			public ExceptionWrapper build(){
				return new ExceptionWrapper(this);
			}
			
		}
		
	}
	
	@ExceptionHandler({ InvalidUserException.class })
	public ModelAndView invalidUserException(RuntimeException runtimeException){
		ExceptionWrapper exceptionWrapper = new ExceptionWrapper.Builder()
			.msg(runtimeException.getMessage())
			.build();
		log.warn("유저 이름 찾을 수 없음.");
		return new ModelAndView("error/exception", "exceptionWrapper", exceptionWrapper);
	}
	
	@ExceptionHandler({ NullPointerException.class })
	public ModelAndView nullPointerException(Exception exception){
		ExceptionWrapper exceptionWrapper = new ExceptionWrapper.Builder()
			.msg(exception.getMessage())
			.build();
		return new ModelAndView("error/exception", "exceptionWrapper", exceptionWrapper);
	}
	
}
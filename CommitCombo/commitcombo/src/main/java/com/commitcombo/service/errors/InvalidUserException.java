package com.commitcombo.service.errors;

public class InvalidUserException extends RuntimeException{
	
	public InvalidUserException(String exceptionMessage){
		super(exceptionMessage);
	}
	
}
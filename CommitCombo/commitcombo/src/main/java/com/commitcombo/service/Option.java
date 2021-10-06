package com.commitcombo.service;

public class Option{
	
	private String animation = "dragUsername";
	
	public Option(String animation){
		this.animation = animation;
	}
	
	public void setAnimation(String animation){
		this.animation = animation;
	}
	
	public String getAnimation(){
		return this.animation;
	}
	
}
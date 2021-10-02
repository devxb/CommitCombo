package com.commitcombo.service;

public class Option{
	
	private String rank = "visible";
	private String animation = "dragUsername";

	public void setRank(String rank){
		this.rank = rank;
	}
	
	public void setAnimation(String animation){
		this.animation = animation;
	}
	
	public String getRank(){
		return this.rank;
	}
	
	public String getAnimation(){
		return this.animation;
	}
	
}
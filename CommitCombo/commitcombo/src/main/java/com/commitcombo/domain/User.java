package com.commitcombo.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Cacheable;

@Entity
@Table(name = "USER")
public class User extends CommonDate{
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "USER_NAME", nullable = false, unique = true)
	private String userName;
	
	@Column(name = "CONTRIBUTION_COUNT", nullable = false)
	private long contributionCount;
	
	@Column(name = "RANK", nullable = false)
	private long rank;
	
	public User(){}
	
	public User(String userName, long contributionCount, long rank){
		this.userName = userName;
		this.contributionCount = contributionCount;
		this.rank = rank;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public void setContributionCount(long contributionCount){
		this.contributionCount = contributionCount;
	}
	
	public void setRank(long rank){
		this.rank = rank;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public long getContributionCount(){
		return this.contributionCount;
	}
	
	public long getRank(){
		return this.rank;
	}
	
	public Long getId(){
		return this.id;
	}
	
	
}
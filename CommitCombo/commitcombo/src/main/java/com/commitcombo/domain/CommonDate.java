package com.commitcombo.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;

import java.time.LocalDate;

@MappedSuperclass
public class CommonDate{
	
	@Column(name = "LAST_MODIFIED_DATE")
	private LocalDate lastModifiedDate = LocalDate.now();
	
	public LocalDate getLastModifiedDate(){
		return this.lastModifiedDate;
	}
	
}
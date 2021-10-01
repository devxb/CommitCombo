package com.commitcombo.service.commonUtil;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DateOperator{
	
	public int dateOptimize(LocalDate localDate){
		String[] stringLocalDate = localDate.toString().split("-");
		StringBuilder sb = new StringBuilder();
		for(String str : stringLocalDate) sb.append(str);
		return Integer.parseInt(sb.toString());
	}
	
	public int dateOptimize(String localDate){
		String[] stringLocalDate = localDate.toString().split("-");
		StringBuilder sb = new StringBuilder();
		for(String str : stringLocalDate) sb.append(str);
		return Integer.parseInt(sb.toString());
	}
	
	public int getThisDay(LocalDate localDate){
		String[] stringLocalDate = localDate.toString().split("-");
		return Integer.parseInt(stringLocalDate[stringLocalDate.length-1]);
	}
	
}
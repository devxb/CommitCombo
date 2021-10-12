package com.commitcombo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.commitcombo.service.commonUtil.ViewOperator;
import com.commitcombo.service.theme.Theme;
import com.commitcombo.domain.User;

@Service
public class ViewFactory{
	
	public ViewMapper getViewMapper(User user, Theme theme, Option option, String version){
		return new ViewMapper(user, theme, option, version);
	}
	
}
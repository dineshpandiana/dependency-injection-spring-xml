package com.spring.training.service.impl;

import com.spring.training.service.SecondService;
import com.spring.training.service.ThirdService;

public class SecondServiceImpl implements SecondService {
	private ThirdService thirdService;
	
	//Setter Injection
	public void setThirdService(ThirdService thirdService) {
		this.thirdService = thirdService;
	}


	public void test() {
		// Implementation goes here..
	}
}

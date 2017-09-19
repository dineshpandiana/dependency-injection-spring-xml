package com.spring.training.service.impl;

import com.spring.training.service.FifthService;
import com.spring.training.service.FourthService;
import com.spring.training.service.ThirdService;

//Both Constructor and Setter Injection
public class ThirdServiceImpl implements ThirdService {

	private FourthService fourthService;
	private FifthService fifthService;

	//Constructor Injection
	public ThirdServiceImpl(FourthService fourthService) {
		super();
		this.fourthService = fourthService;
	}

	// Setter Injection
	public void setFifthService(FifthService fifthService) {
		this.fifthService = fifthService;
	}

	@Override
	public void invokeService() {
		// Implementation goes here..
	}

}

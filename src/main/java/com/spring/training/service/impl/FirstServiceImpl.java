package com.spring.training.service.impl;

import com.spring.training.service.FirstService;
import com.spring.training.service.SecondService;

public class FirstServiceImpl implements FirstService {

	private SecondService secondService;
	
	//Constructor Injection
	public FirstServiceImpl(SecondService secondService) {
		super();
		this.secondService = secondService;
	}

	public void print() {
		// Implementation goes here..
	}

	public void destroy() {
		// Implementation goes here..
	}
}

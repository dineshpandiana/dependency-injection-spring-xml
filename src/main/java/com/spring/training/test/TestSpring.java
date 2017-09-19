package com.spring.training.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.service.FirstService;
import com.spring.training.service.SecondService;
import com.spring.training.service.ThirdService;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// Dependency injected by constructor injection
		FirstService firstService = (FirstService) context
				.getBean("firstService");
		firstService.print();

		// Dependency injected by setter injection
		SecondService secondServioce = (SecondService) context
				.getBean("secondService");
		secondServioce.test();

		// Dependency injected by constructor & setter injection
		ThirdService thirdService = (ThirdService) context
				.getBean("thirdService");
		thirdService.invokeService();

		context.close();
	}

}

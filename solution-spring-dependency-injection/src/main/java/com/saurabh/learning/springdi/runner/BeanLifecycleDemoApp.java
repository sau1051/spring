package com.saurabh.learning.springdi.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saurabh.learning.springdi.Coach;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		Coach coach1 = applicationContext.getBean("myCoach", Coach.class);
		
		System.out.println(coach1.getDailyWorkout());
		
		System.out.println(coach1.getDailyFortune());
		
		((AbstractApplicationContext) applicationContext).close();		
		
	}

}

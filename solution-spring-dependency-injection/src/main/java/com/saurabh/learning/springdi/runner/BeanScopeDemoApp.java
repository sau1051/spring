package com.saurabh.learning.springdi.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saurabh.learning.springdi.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach1 = applicationContext.getBean("myCoach", Coach.class);
		
		Coach coach2 = applicationContext.getBean("myCoach", Coach.class);
		
		boolean isSimilar = (coach1 == coach2);
		
		System.out.println("\nPointing to same object : " + isSimilar);
		
		((AbstractApplicationContext) applicationContext).close();		
		
	}

}

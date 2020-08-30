package com.saurabh.learning.springdi.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saurabh.learning.springdi.Coach;
import com.saurabh.learning.springdi.CricketCoach;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println("CricketCoach:" + myCricketCoach.getDailyWorkout());
		System.out.println("CricketCoach:" + myCricketCoach.getDailyFortune());
		System.out.println("CricketCoach:" + myCricketCoach.getEmailAddress());
		System.out.println("CricketCoach:" + myCricketCoach.getTeam());
		
		// close the context
		context.close();
	}

}








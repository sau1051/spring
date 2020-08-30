package com.saurabh.learning.springdi.runner;

import com.saurabh.learning.springdi.Coach;
import com.saurabh.learning.springdi.TrackCoach;

@Deprecated
public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}

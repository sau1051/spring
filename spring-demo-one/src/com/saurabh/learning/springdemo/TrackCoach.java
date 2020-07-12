/**
 * 
 */
package com.saurabh.learning.springdemo;

/**
 * @author q839010
 *
 */
public class TrackCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.saurabh.learning.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

}

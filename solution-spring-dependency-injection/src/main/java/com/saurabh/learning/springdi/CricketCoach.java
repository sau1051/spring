/**
 * 
 */
package com.saurabh.learning.springdi;

/**
 * @author q839010
 *
 */
public class CricketCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	private String emailAddress;
	
	private String team;
	
	public CricketCoach() {
		System.out.println("Hi I am inside no-arg constructor of CricketCoach class...");
	}

	public void setMyFortuneService(FortuneService myFortuneService) {
		System.out.println("Hi I am inside setter method for setMyFortuneService");
		this.myFortuneService = myFortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Hi I am inside setter method for setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Hi I am inside setter method for setTeam");
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practised batting in net for 1 hour";
	}

	
	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}

}

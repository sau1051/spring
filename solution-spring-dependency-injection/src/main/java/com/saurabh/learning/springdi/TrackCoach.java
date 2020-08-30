package com.saurabh.learning.springdi;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		System.out.println("Constructor TrackCoach called !!!");
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Constructor with parameter TrackCoach called !!!");
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	private void initBean() {
		System.out.println("TrackCoach : initBean called !!!");
	}
	
	private void destroyBean() {
		System.out.println("TrackCoach : destroyBean called !!!");
	}

}











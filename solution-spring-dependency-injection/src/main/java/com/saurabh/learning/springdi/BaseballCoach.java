package com.saurabh.learning.springdi;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	private String aa;
	
	// define a constructor for dependency injection
	public BaseballCoach(final String aa, FortuneService theFortuneService) {
		super();
		this.aa = aa;
		//System.out.println("hiiiiiiiiiiiiooooooooooooooo:::::" + this.aa);
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {		
		// use my fortuneService to get a fortune		
		return fortuneService.getFortune();
	}
}









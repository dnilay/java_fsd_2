package com.mycompny.spring_demo_04th_09.bean;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String teamName;
	

	public CricketCoach() {
		super();
	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 5k running today "+getTeamName()+" "+getEmail();
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortuneService();
	}
	
	public void getCoachName()
	{
		System.out.println( "coach--> Ravi Shastry");
	}
	
	public void getContractRemoved()
	{
		System.out.println("no such coach available.! contract over");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.tka.dev23.actorInfo;

public class Actor {
	
	private String name;
	private int age;
	private int noOfMovies;
	private double netWorth;
	private String debutdate;
	
	
	// Constructor

	public Actor(String name, int age, int noOfMovies, double netWorth, String debutdate) {
		super();
		this.name = name;
		this.age = age;
		this.noOfMovies = noOfMovies;
		this.netWorth = netWorth;
		this.debutdate = debutdate;
	}


	public Actor() {
		super();
	}

	// Getter and Setter
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getNoOfMovies() {
		return noOfMovies;
	}


	public void setNoOfMovies(int noOfMovies) {
		this.noOfMovies = noOfMovies;
	}


	public double getNetWorth() {
		return netWorth;
	}


	public void setNetWorth(double netWorth) {
		this.netWorth = netWorth;
	}


	public String getDebutdate() {
		return debutdate;
	}


	public void setDebutdate(String debutdate) {
		this.debutdate = debutdate;
	}


	//to-String method
	
	@Override
	public String toString() {
		return "Actor [name=" + name + ", age=" + age + ", noOfMovies=" + noOfMovies + ", netWorth=" + netWorth
				+ ", debutdate=" + debutdate + "]";
	}


	
	
	

}

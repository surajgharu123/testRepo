package com.banking;

public class RandomNumber {
	private double randomNumber;

	public RandomNumber() {
		super();
		// TODO Auto-generated constructor stub
		this.randomNumber = Math.random()*100;
	}

	public double getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	

}

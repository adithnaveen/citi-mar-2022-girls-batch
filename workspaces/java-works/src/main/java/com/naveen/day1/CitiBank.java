package com.naveen.day1;

public class CitiBank implements IBank{

	@Override
	public void deposit(int amount) {
		System.out.println("you are withdrawing amount : "+ amount);
	}

	@Override
	public double withdraw(int amount) {
		// check the balance from the database
		double balance = 1000; 
		return balance - amount; 
		
	}
	
}

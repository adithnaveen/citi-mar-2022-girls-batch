package com.naveen.factory;

public class App {
	public static void main(String[] args) {
		
		Bank bank = Bank.getBankAccount(Types.CA); 
		bank.transaction(); 
		
		
		bank = Bank.getBankAccount(Types.SB); 
		bank.transaction(); 
		
	}
}

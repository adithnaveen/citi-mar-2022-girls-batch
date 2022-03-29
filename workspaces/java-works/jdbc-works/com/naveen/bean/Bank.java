package com.naveen.bean;

public class Bank {
	private int bankId; 
	private String bankName; 
	private String location;
	
	public Bank() {
	// if you want to use setters you can use default constructor 
	}
	
	public Bank(int bankId, String bankName, String location) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.location = location;
	}

	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	} 
	
	
}

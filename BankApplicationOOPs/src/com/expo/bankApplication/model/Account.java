package com.expo.bankApplication.model;

public class Account {

	private int accountNumber;
	private String name;
	private String adharcardNumber;
	private String pancardNumber;
	private long contact;
	private String email;
	private double accountBalance;
	
	

	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharcardNumber() {
		return adharcardNumber;
	}
	public void setAdharcardNumber(String adharcardNumber) {
		this.adharcardNumber = adharcardNumber;
	}
	public String getPancardNumber() {
		return pancardNumber;
	}
	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString() {
	    return "\n-----------------------------------------------"
	         + "\n             ACCOUNT DETAILS"
	         + "\n-----------------------------------------------"
	         + "\nAccount Number  : " + accountNumber
	         + "\nName            : " + name
	         + "\nAadhar Number   : " + adharcardNumber
	         + "\nPAN Number      : " + pancardNumber
	         + "\nContact         : " + contact
	         + "\nEmail           : " + email
	         + "\nAccount Balance : " + accountBalance
	         + "\n-----------------------------------------------";
	}
	
}

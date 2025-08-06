package com.exception;

public class BankAccount {
	private String accountHolder;
	private double balance;
	public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount<0) {
			throw new IllegalArgumentException();
		}
		
	}

}

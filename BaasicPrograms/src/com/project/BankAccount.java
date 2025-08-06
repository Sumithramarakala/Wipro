package com.project;
import java.util.Scanner;
public class BankAccount {
	Scanner sc=new Scanner(System.in);
	
	int balance,amount;
	public void deposite(int amount) {
		System.out.println("Enter deposite amount");
		//int amnt=sc.nextInt();
		
		//balance=amnt;
		//System.out.println(amnt);
		//System.out.println(amount);
		balance+=amount;
		System.out.println("Your balance is "+balance);	}
	public void withdraw(int amount) {
		System.out.println("Enter withdraw amount");
		if(balance<=0) {
			System.out.println("In your account no balance");
		}
		//int amnt1=sc.nextInt();
		//balance-=amnt1;
		balance-=amount;
		
		
		System.out.println("Your balance is: "+balance);
	}
	void display() {
		System.out.println("Balance "+this.balance);
	}
	public static void main(String[] args) {
		
		BankAccount b=new BankAccount();
		b.deposite(500);
		b.withdraw(100);
		//b.display();
	}

}

/*public class BankAccount {
	
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public class Transaction{
		
		public void deposit(double amount)
		{
			balance += amount;
			System.out.println(amount + "Rs. is Deposited and now the balance is :" + balance );
			
		}
		
		public void withdraw(double amount)
		{
			if(amount<= balance)
			{
			balance -= amount;
			System.out.println( "Withdrawl amount is " + amount + "and now the balance is :" + balance );
			}
		}
	}

 public void showBalance()
 {
	 
	 System.out.println("Account Holder :" + accountHolder + " Balance in your account is :" + balance);
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc = new BankAccount("Niti" , 5000);
		BankAccount.Transaction t = acc.new Transaction(); // the inner class object must be tied with outer class object
		System.out.println("The current Balance in your account is :");
		acc.showBalance();
		t.deposit(2000);
		acc.showBalance();
		t.withdraw(1000);
		acc.showBalance();
	}

}*/

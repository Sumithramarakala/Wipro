package com.bank;

//Bean,Pojo,Entity(where we have private,fieds,getter ,setter,constructor
//data between JSP pages
public class LoanBean {
	private String customerName;
	private double loanAmount;
	private int tenure;
	private double emi;
	
	//Values are injected through getter and setter--Dependency injection
	
	public LoanBean() {
		super();
	}
	
	public LoanBean(String customerName, double loanAmount, int tenure, double emi) {
		super();
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.emi = emi;
	}
	@Override
	public String toString() {
		return "LoanBean [customerName=" + customerName + ", loanAmount=" + loanAmount + ", tenure=" + tenure + ", emi="
				+ emi + "]";
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	
	
	
	

}

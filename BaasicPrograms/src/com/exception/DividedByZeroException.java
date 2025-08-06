package com.exception;

public class DividedByZeroException {
	public static void main(String[] args) {
		int div,result;
		int n1=40,n2=0;
		try {
			result=n1/n2;
			System.out.println("result: "+result);
		
		}
		catch(ArithmeticException ex){
			System.out.println("Exception occure");
			
		}
		finally {
			System.out.println("division");
		}
		
	}

}

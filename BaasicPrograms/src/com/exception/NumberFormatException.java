package com.exception;

public class NumberFormatException {
	public static void main(String[] args) {
		String str="abc";
		try {
			int num=Integer.parseInt(str);
			System.out.println(" Number: "+num);
			
		}
		catch(Exception ex) {
			System.out.println("Its invalid number");
			
		}
		finally {
			
		}
	}

}

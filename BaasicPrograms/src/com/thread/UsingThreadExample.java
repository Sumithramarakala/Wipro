package com.thread;

class SharedData{
	int sharedValue = 0;
	
}


public class UsingThreadExample extends Thread {
	
	public static void main(String[] args) {
		SharedData data= new SharedData();
		int localValue=0;
		String threadName=Thread.currentThread().getName();
		for(int i=0;i<=3;i++) {
			localValue++;
			data.sharedValue++;
			
			System.out.println("At i " +i+ "the locale value "
			+localValue+ "Shared Value"+data.sharedValue);
			
		}
		Thread t1=new Thread();
		t1.setName("Thread 1");
		t1.start();
		Thread t2=new Thread();
		t2.setName("Thread2");
		t2.start();
		System.out.println("the locale value: "
				+localValue+ " Shared Value: "+data.sharedValue);
				
		
		
	}

}

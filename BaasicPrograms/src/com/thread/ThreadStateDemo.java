package com.thread;

public class ThreadStateDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t= new Thread(()->{
			try {
				System.out.println("Thread: ");
				Thread.sleep(2000);
				System.out.println("Thread Run completed");
			}catch(Exception e) {
				
				e.printStackTrace();
		}
		});
		
		System.out.println("State after creation : "+t.getState());
		//Thread t=new Thread() //thread 1 is created
		t.start();
		System.out.println("State after start :"+t.getState());
		//Thread t will be in runnable state
		
		Thread.sleep(1000); //main tread will go on sleep mode so 
		//that thread1 will go in waiting state
		System.out.println("During thread sleep: "+t.getState());
		
		t.join(); // Main will wait for thread t to finish
		//Main thread will wait for thread t to finish
		System.out.println("State after terminated: "+t.getState());

	}

}

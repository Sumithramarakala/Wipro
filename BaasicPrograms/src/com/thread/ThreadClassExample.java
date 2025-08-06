package com.thread;

public class ThreadClassExample extends Thread{
	
	public void run() {
		System.out.println(" Thread is running "+Thread.currentThread() .getName() );
	}
	
	public static void main(String[] args) {
		ThreadClassExample th= new ThreadClassExample();
		th.setName("ThreadName");
		th.start();
		
	}
	

}

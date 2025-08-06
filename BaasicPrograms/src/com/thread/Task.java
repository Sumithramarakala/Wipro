package com.thread;

class FileUpload extends Thread{
	private String username;

	public FileUpload(String username) {
		super();
		this.username = username;
	}
	public void run() {
		System.out.println(username+"uploading the file ");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			//Thread.currentThread().interrupt();
			e.printStackTrace();
			
		}
		System.out.println(username+"Finish uploading.. ");
	}
}

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FileUpload userA=new FileUpload("Sumithra ");
		FileUpload userB=new FileUpload("Suchithra ");
		userA.start();
		userB.start();
		
		userA.join();
		userB.join();
		
		System.out.println("Both user completed the task");
		

	}

}

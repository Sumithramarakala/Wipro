package com.thread;

class BillingSystem{
private boolean isBilled = false;

public synchronized void billUser(String user) {
System.out.println("Billing started " +user);
try {
Thread.sleep(2000);
}catch(InterruptedException e) {
e.printStackTrace();
}
isBilled=true;
System.out.println("Billing is completed for " + user);
notify();
}

public synchronized void waitForBilling(String user) {
// TODO Auto-generated method stub
while(!isBilled) {
try {
wait();
}catch(InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("billing done");
isBilled = false;

}
}
public class Task2 extends Thread{
private String username;
private BillingSystem billingSystem;
public Task2(String username, BillingSystem billingSystem) {
super();
this.username = username;
this.billingSystem = billingSystem;
}

@Override
public void run() {
System.out.println(username + "is placing the order..");
try {
Thread.sleep(1000);
}catch(InterruptedException e) {
e.printStackTrace();
}
System.out.println(username + "has placed the order");

new Thread(() -> billingSystem.billUser(username)).start();

billingSystem.waitForBilling(username);
}


public static void main(String[] args) {
BillingSystem billingSystem = new BillingSystem();

System.out.println("Synchronous order ");
Task2 userA = new Task2("User-A",billingSystem);
Task2 userB = new Task2("User-B",billingSystem);
Task2 userC = new Task2("User-C",billingSystem);

try {
userA.start();
userA.join();

userB.start();
userB.join();

userC.start();
userC.join();
}catch(InterruptedException e) {
e.printStackTrace();
}
System.out.println("All users have completed their order and billings");
}
}
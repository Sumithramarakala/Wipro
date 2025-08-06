package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;



public class QueueExample {
	public static void main(String[] args) {
	Queue<String> q = new LinkedList<>();
	q.offer("Sumi");  //insertion, enqueue
	q.offer("Jatin");
	q.offer("Ayush");
	q.offer("abc");
	q.offer("Suchi");
	
	System.out.println("In the queue are: "+q);
	q.remove();// it will remove Sumi
	q.poll(); // retrieving the element and deletion from the front // it will remove the Jatin
	System.out.println("In the queue are: "+q); //only Ayush is in the queue
	
	System.out.println(q.element());
	System.out.println(q.size());
	//System.out.println(q.remove());
	System.out.println(q.isEmpty());
	
	System.out.println(q.peek());
	List<String> list = new ArrayList<>(q);
	System.out.println(list.get(1));
	
	int i=0;
	int index = 3;
	for(String item : q) {
		if(i==index) {
			System.out.println("Element at index: "+q);
			break;
		}
		i++;
	}
	Queue<Integer> pq=new PriorityQueue<>();
	pq.offer(500);
	pq.offer(70);
	pq.offer(100);
	
	System.out.println(pq.poll()); // it is priority queue thats why it removing 70 which is lowest one among three element
	pq.poll();
	System.out.println(pq);

}
}
package com.collection;

public class Data<T> {
	private T item;
	
	
	public T getItem() {
		return item;
	}


	public void setItem(T item) {
		this.item = item;
	}

	public static void main(String[] args) {
		Data<String> d1 = new Data<>();
		d1.setItem("Hello");
		Data<Integer> d2 = new Data<>();
		d2.setItem(123);
		System.out.println(d1.getItem());
		System.out.println(d2.getItem());
		
	}

}

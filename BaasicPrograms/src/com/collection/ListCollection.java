package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(102);
		list.add(345);
		list.add(102);
		System.out.println("list are "+list);
		
		List aList=new ArrayList();
		aList.add("Sumi");
		aList.add(list);
		System.out.println("list is: "+aList);
		// TODO Auto-generated method stub

	}

}

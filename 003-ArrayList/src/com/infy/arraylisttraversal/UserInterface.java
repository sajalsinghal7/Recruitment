package com.infy.arraylisttraversal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UserInterface {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sachin");
		list.add("Rahul");
		list.add("Dhoni");
		list.add("Yuvraj");
		//Iterating across list using for loop
		System.out.println("Iterating using for loop");
		for (int index = 0; index < list.size(); index++) {
			// get(int index) method is used to fetch element at index
			System.out.println(list.get(index));
		}
		
		System.out.println("Iterating using for-each loop");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("Iterating using Iterator interface");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Iterating using ListIterator interface");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("Iterating using ListIterator interface and printing in reverse order");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}

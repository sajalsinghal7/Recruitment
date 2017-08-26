package com.infy.linkedlist;

import java.util.LinkedList;
import java.util.List;


public class UserInterface {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Sachin");
		list.add("Virat");
		list.add("Ashwin");
		list.add(1, "Yuvraj");
		System.out.println("A list of players in a LinkedList");
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}

}

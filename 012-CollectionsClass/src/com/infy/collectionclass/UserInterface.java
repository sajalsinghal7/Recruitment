package com.infy.collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserInterface {
	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("Honda City");
		list.add("Chevrolet Beat");
		list.add("Hyundai Sonata");
		list.add("Suzuki Ciaz");
		System.out.println("Original list of cars : " + list);
		Collections.shuffle(list);
		System.out.println("List of cars after shuffling list : " + list);
		Collections.sort(list);
		System.out.println("List of cars after sorting : " + list);
		Collections.reverse(list);
		System.out.println("List of cars after reversing : " + list);
	}
}

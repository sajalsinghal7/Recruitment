package com.infy.ArraysClass;

import java.util.Arrays;
import java.util.List;

public class UserInterface {
	public static void main(String[] args) {
		// Creating an array of strings
		String a[] = {"Sachin", "Rohit", "Ajay", "Amit" };

		List<String> list1 = Arrays.asList(a);

		// Displaying the list
		System.out.println("The list is:" + list1);

	}
}

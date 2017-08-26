package com.infy.genericmethod;

public class UserInterface {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5 };
		String[] cities = { "Delhi", "Mumbai", "Chennai", "Kolkotta" };
		// Invoking generic method
		UserInterface.<Integer>display(numbers);
		UserInterface.<String>display(cities);
	}

	// Generic method
	public static <E> void display(E[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + ",");
		System.out.println();
	}
}

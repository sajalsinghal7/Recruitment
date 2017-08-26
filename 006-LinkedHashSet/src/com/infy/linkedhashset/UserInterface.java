package com.infy.linkedhashset;


import java.util.LinkedHashSet;
import java.util.Set;

public class UserInterface {

	public static void main(String[] args) {
		// Creating a linked hash set containing names of cities
		Set<String> hset = new LinkedHashSet<String>();
		// Adding strings to linked hash set
		hset.add("Delhi");
		hset.add("Mumbai");
		hset.add("Kolkatta");
		hset.add("Pune");
		System.out.println("Elements of HashSet are ");
		// Displaying the elements in the linked hash set
		System.out.println(hset);
	}
}

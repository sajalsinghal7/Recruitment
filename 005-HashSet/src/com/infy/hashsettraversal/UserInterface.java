package com.infy.hashsettraversal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserInterface {

	public static void main(String[] args) {
		// Creating a hash set containing names of cities
		Set<String> set = new HashSet<String>();
		// Adding strings to hash set
		set.add("Delhi");
		set.add("Mumbai");
		set.add("Kolkatta");
		set.add("delhi");
		set.add("Delhi");
		// Displaying the elements in the hash set using for-each loop
		System.out.println("The cities in set are: ");
		for (String city : set) {
			System.out.println(city);
		}
		// Displaying the elements in the hash set using Iterator loop
		// Obtaining an iterator for hash set
		Iterator<String> setiterator = set.iterator();
		System.out.println("The cities in set are: ");
		while (setiterator.hasNext()) {
			System.out.println(setiterator.next());

		}
	}
}

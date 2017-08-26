package com.infy.hashsetmethods;

import java.util.HashSet;

import java.util.Set;

public class UserInterface {

	public static void main(String[] args) {
		// Creating a hash set containing names of cities
		Set<String> set1 = new HashSet<String>();
		// Adding strings to hash set
		set1.add("Delhi");
		set1.add("Mumbai");
		set1.add("Kolkatta");
		set1.add("delhi");
		set1.add("Delhi");
		System.out.println("The cities int set1 are : " + set1);
		System.out.println("The number of cities in set1 are: " + set1.size());
		// Creating another hash set containing names of cities
		Set<String> set2 = new HashSet<String>();
		// Adding strings to hash set
		set2.add("Banglore");
		set2.add("Lucknow");
		set2.add("Pune");
		System.out.println("The cities int set2 are : " + set1);
		// Adding all elements of set2 to set1
		set1.addAll(set2);
		System.out.println("The cities int set1 after adding set2 are : "
				+ set1);
		System.out.println("Set1 contains Mysore : " + set1.contains("Mysore"));
		System.out.println("Set1 contains Delhi : " + set1.contains("Delhi"));
		// Removing Delhi from set1
		set1.remove("Delhi");
		System.out.println("The cities int set1 after removing Delhi are : "
				+ set1);
	}

}

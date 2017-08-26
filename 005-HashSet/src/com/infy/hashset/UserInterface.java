package com.infy.hashset;

import java.util.HashSet;
import java.util.Set;

public class UserInterface {

	public static void main(String[] args) {
		//Creating a hash set containing names of cities
		Set<String> cities=new HashSet<String>();			
		//Adding strings to hash set
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Kolkatta");
		cities.add("delhi");			
		cities.add("Delhi");			
		System.out.println("Elements of HashSet are ");
		//Displaying the elements in the hash set
		System.out.println(cities);	
		
		
	
	}

}

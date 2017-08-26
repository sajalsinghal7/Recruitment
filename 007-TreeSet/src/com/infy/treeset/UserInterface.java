package com.infy.treeset;

import java.util.Set;
import java.util.TreeSet;

public class UserInterface {

	public static void main(String[] args) {
		//Creating a linked tree set containing names of cities
		Set<String> tset=new TreeSet<String>();			
		//Adding strings to tree set
		tset.add("Delhi");
		tset.add("Mumbai");
		tset.add("Kolkatta");
		tset.add("Pune");			
		System.out.println("Elements of TreeSet are ");
		//Displaying the elements in the tree set
		System.out.println(tset);	
		
		
	}

}

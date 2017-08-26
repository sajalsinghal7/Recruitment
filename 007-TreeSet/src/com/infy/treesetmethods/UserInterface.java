package com.infy.treesetmethods;



import java.util.TreeSet;

public class UserInterface {

	public static void main(String[] args) {
		//Creating a tree set containing names of cities
		TreeSet<String> tset=new TreeSet<String>();			
		//Adding strings to tree set
		tset.add("Delhi");
		tset.add("Mumbai");
		tset.add("Kolkatta");
		tset.add("Pune");	
		//Displaying the elements in the tree set
		System.out.println("Elements of TreeSet are ");
		
		System.out.println(tset);
		//Displaying the first element in the tree set
		System.out.println("First element is " + tset.first());
		//Displaying the last element in the tree set
		System.out.println("Last element is "+tset.last());
		
		
	}

}

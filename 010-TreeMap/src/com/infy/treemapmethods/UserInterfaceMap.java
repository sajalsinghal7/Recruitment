package com.infy.treemapmethods;


import java.util.TreeMap;

public class UserInterfaceMap {

	public static void main(String[] args) {
		// Creating a tree map with containg employee details
		// Employee id is key and employee name is value
		TreeMap<Integer, String> hMap = new TreeMap<Integer, String>();
		hMap.put(101, "Priya");
		hMap.put(201, "Puneet");
		hMap.put(301, "Ajay");
		hMap.put(401, "Kapil");
		hMap.put(501, "Dipti");
		//Displaying elements tree map
		System.out.println("Elements of TreeMap are" + hMap);
		System.out.println("Key of first element " + hMap.firstKey());
		System.out.println("Key od last element " + hMap.lastKey());

	}
}
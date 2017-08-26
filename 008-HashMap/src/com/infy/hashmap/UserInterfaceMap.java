package com.infy.hashmap;

import java.util.HashMap;

import java.util.Map;

public class UserInterfaceMap {

	public static void main(String[] args) {
		// Creating a hash map with containg employee details
		// Employee id is key and employee name is value
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(101, "Priya");
		hMap.put(201, "Puneet");
		hMap.put(301, "Ajay");
		hMap.put(401, "Kapil");
		hMap.put(501, "Dipti");
		//Displaying elements of hashmap
		System.out.println("Elements of HashMap are" + hMap);
	
		
	}
}
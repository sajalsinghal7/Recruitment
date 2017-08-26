package com.infy.hashmapmethods;


import java.util.HashMap;

import java.util.Map;

public class UserInterfaceMap {

	public static void main(String[] args) {
		// Creating a hash map with containing employee details
		// Employee id is key and employee name is value
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(101, "Priya");
		hMap.put(201, "Puneet");
		hMap.put(301, "Ajay");

		// Displaying elements of hashmap
		System.out.println(hMap);
		hMap.remove(101);
		System.out.println(hMap);
		System.out.println(hMap.size());

	}
}
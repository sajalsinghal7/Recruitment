package com.infy.treemap;

import java.util.Map;
import java.util.TreeMap;

public class UserInterfaceMap {

	public static void main(String[] args) {
		// Creating a tree map with containg employee details
		// Employee id is key and employee name is value
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		hMap.put(101, "Priya");
		hMap.put(201, "Puneet");
		hMap.put(301, "Ajay");
		hMap.put(401, "Kapil");
		hMap.put(501, "Dipti");
		//Displaying elements of hashmap
		System.out.println("Elements of TreeMap are" + hMap);

	}
}
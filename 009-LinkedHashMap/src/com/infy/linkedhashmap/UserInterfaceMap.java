package com.infy.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserInterfaceMap {

	public static void main(String[] args) {
		// Creating a linked hash map with containing employee details
		// Employee id is key and employee name is value
		Map<Integer, String> hMap = new LinkedHashMap<Integer, String>();
		hMap.put(101, "Priya");
		hMap.put(201, "Puneet");
		hMap.put(301, "Ajay");
		hMap.put(401, "Kapil");
		hMap.put(501, "Dipti");
		//Displaying elements of hashmap
		System.out.println("Elements of LinkedHashMap are" + hMap);

	}
}
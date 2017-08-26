package com.infy.hashmaptraversal;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class UserInterfaceMap {

	public static void main(String[] args) {
		// Creating a hash map with containing employee details
		// Employee id is key and employee name is value
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(101, "Priya");
		hMap.put(201, "Puneet");
		hMap.put(301, "Ajay");

		// Displaying elements of hashmap using Set of keys
		System.out.println("Displaying using keySet()");
		Set<Integer> keys = hMap.keySet();
		for (Integer key : keys) {
			String value = hMap.get(key);
			System.out.println("Key : " + key + " Value : " + value);
		}

		// Displaying elements of hashmap using Set of Entry
		System.out.println("Displaying using entrySet()");
		Set<Entry<Integer, String>> entry = hMap.entrySet();
		for (Entry<Integer, String> e : entry) {
			System.out.println("Key : " + e.getKey() + " Value : "
					+ e.getValue());
		}

		
	}
}
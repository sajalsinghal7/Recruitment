package com.infy.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserInterfaceConcurrentHashMap {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> concurrentHashMap= new ConcurrentHashMap<String, String>();
		concurrentHashMap.put("King", "Lion");
		concurrentHashMap.put("National Animal", "Tiger");
		concurrentHashMap.put("National Bird", "Peacock");
		for(Map.Entry<String, String> entry : concurrentHashMap.entrySet()){
			concurrentHashMap.put("National Game", "hockey");							
			// in case of HashMap we cannot modify map while iterating.
			System.out.println("Key : "+entry.getKey()+",   Value : "+entry.getValue());
		}
	}

}

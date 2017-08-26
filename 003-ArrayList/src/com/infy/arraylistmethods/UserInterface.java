package com.infy.arraylistmethods;

import java.util.ArrayList;
import java.util.List;


public class UserInterface {
	public static void main(String[] args) {
		List<String> team1 = new ArrayList<String>();
		//Adding players to team1
		team1.add("Sachin");
		team1.add("Virat");
		team1.add("Ashwin");
		System.out.println("Team 1 : " + team1);
		//Returning size of team1
		System.out.println("Size of Team1 is : " + team1.size());
		List<String> team2 = new ArrayList<String>();
		//Adding players to team2
		team2.add("Rohit");
		team2.add("Ashwin");
		team2.add("Jadeja");
		//Adding element at index position 1
		team2.add(1,"Yuvraj");
		System.out.println("Team 2 : " + team2);
		//Returning size of team1
		System.out.println("Size of Team2 is : " + team2.size());
		//Adding all elements of team1 to team2
		team1.addAll(team2);
		System.out.println("Team 1 after adding Team 2 : " + team1);
		//Removing elemet at index position 1
		team1.remove(1);
		//Removing element Yuvraj
		team1.remove("Yuvraj");
		System.out.println("Team 1 after removing players : " + team1);
		//Checking whether team1 contains Sachin or not
		System.out.println("Team 1 contains Sachin : " + team1.contains("Sachin"));
		//Checking whether team1 contains any player or not
		System.out.println("Team1 is empty : " + team1.isEmpty());
	}
}

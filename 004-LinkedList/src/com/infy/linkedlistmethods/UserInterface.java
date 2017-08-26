package com.infy.linkedlistmethods;


import java.util.LinkedList;



public class UserInterface {
	public static void main(String[] args) {
		LinkedList<String> team1 = new LinkedList<String>();
		//Adding players to team1
		team1.add("Sachin");
		team1.add("Virat");
		team1.add("Ashwin");
		//Adding player at the beginning of list
		team1.addFirst("Jadeja");
		//Adding player at the end of list
		team1.addLast("Rahul");
		System.out.println("Team 1 : " + team1);
		System.out.println("Size of Team1 is : " + team1.size());
		//Getting player at the beginning of list
		System.out.println("First element of list : " + team1.getFirst());
		//Getting player at the end of list
		System.out.println("Last element of list : " + team1.getLast());
		System.out.println("List before deleting first and last element : " + team1);
		//Deleting player at the beginning of list
		team1.removeFirst();
		//Deleting player at the end of list
		team1.removeLast();
		System.out.println("List after deleting first and last element : " + team1);
		
		
	}
}

package com.infy.genericclass;

public class UserInterface
{
	public static void main(String[] args) {
		GenericStack<String> gStack = new GenericStack<String>();
		gStack.push("Sachin");
		gStack.push("Rahul");
		gStack.push("Amit");
		gStack.push("Ajay");
		while(!gStack.isEmpty())
		{
			String element = gStack.pop();
			System.out.println(element);
		}
	}
}
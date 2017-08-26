package com.infy.throwsclause;

public class UserInterface {

	static void throwMethod() throws IllegalAccessException {
		System.out.println("Inside throwMethod.");
		throw new IllegalAccessException("IllegalAccessException thrown");
	}

	public static void main(String args[]) {
		try {
			throwMethod();
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
		}
	}
}

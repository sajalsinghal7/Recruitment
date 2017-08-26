package com.infy.multicatch;

public class UserInterface {
	public static void main(String[] args) {
		try {
			int num1 = 56;
			int num2 = 0;
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException  | ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

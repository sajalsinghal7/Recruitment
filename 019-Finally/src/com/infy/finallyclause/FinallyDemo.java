package com.infy.finallyclause;

/**
 * Demonstrates usage of finally block
 * @author ETA
 */

public class FinallyDemo {

	public static void main(String[] args) {
		
		try {
			int num1 = 56;
			int num2 = 0;
			int result = num1 / num2;
			System.out.println(result);
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Executing finally block");
		}
	}
}

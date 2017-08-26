package com.infy.junit;

public class MathUtility {
	
	/**
	 * Checks if the number is prime or not
	 * @param num  an integer
	 * @return boolean  true if number is prime, false otherwise 
	 */
	public static boolean checkIsPrime(int num)
	{
		for(int i = 2; i<=num/2; i++)
		{
			if(num%i == 0)
			{
				return false;
				
			}
		}
		return true;
	}
	
	/**
	 * Checks if the number is even or odd
	 * @param num  an integer
	 * @return int 0 if number is even, 1 otherwise 
	 */
	public static int checkEvenOrOdd(int num)
	{
		int mod = num % 2;
		return mod;
	}
}

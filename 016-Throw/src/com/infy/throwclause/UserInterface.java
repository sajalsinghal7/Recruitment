package com.infy.throwclause;


/**
 * @author ETA
 */
public class UserInterface {


	public static void main(String[] args) {
		int a = 0, b = 0;
		try
		{
			if(b==0)
				throw new ArithmeticException("b is too small.");
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		System.out.println(" a = " + a);
	}
}

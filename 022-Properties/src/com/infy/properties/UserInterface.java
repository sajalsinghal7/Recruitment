package com.infy.properties;

import utility.AppConfig;


/**
 * Demonstrates the use of properties file
 * @author ETA
 */
public class UserInterface 
{	
	static int balance = 1000;
	
	public static void main(String[] args) 
	{
		try
		{
			int amountToDeposit = 1000;
			int amountToWithdraw = 2000;
			
			UserInterface.deposit(amountToDeposit);
			UserInterface.withdraw(amountToWithdraw);
		}
		catch(Exception exception)
		{
			//getProperty method returns the value from the properties file that corresponds to the key passed to it as argument
			System.out.println(AppConfig.PROPERTIES.getProperty(exception.getMessage()));
		}

	}
	
	
	/**
	 * Adds the amount to the current balance and displays the final balance
	 * @param amt an integer value which needs to be added to the current balance
	 * @return none
	 * @throws Exception
	 */
	public static void deposit(int amt) throws Exception
	{
		//negative amount cannot be deposited
		if(amt<0)
		{
			throw new Exception("PropertiesTester.INVALID_AMOUNT");
		}
			balance = balance + amt;
			
			//overloaded getProperty methods uses the default value(second argument), if the key(first argument) is not present in properties file.
			String message = AppConfig.PROPERTIES.getProperty("PropertiesTester.TRANSACTION_SUCCESS", "Transaction successful");
			System.out.println(message);
			System.out.println("The final balance is:"+balance);
	}
	
	
	/**
	 * Subtracts the amount from the current balance and displays the final balance
	 * @param amt an integer value which needs to be subtracted from the current balance
	 * @return none
	 * @throws Exception
	 */
	public static void withdraw(int amt) throws Exception
	{
		//negative amount cannot be withdrawn
		if(amt<0)
		{
			throw new Exception("PropertiesTester.INVALID_AMOUNT");
		}
		
		//the current balance cannot be less than the amount to be withdrawn
		if(balance-amt < 0)
		{
			throw new Exception("PropertiesTester.TRANSACTION_FAILURE");
		}
		else
		{
			balance = balance - amt;
			String message = AppConfig.PROPERTIES.getProperty("PropertiesTester.TRANSACTION_SUCCESS", "Transaction successful");
			System.out.println(message);
			System.out.println("The final balance is:"+balance);
		}
		
	}

}

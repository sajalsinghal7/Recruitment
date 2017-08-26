package com.infy.log4j;

import org.apache.log4j.Logger;


/**
 * Demonstrates logging and levels of logging
 * @author ETA
 */

public class UserInterface 
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 5, 7};
		UserInterface log4jTester = new UserInterface();
		log4jTester.displayArrayValues(arr);
	}

	/**
	 * Displays the content of the array being passed
	 * @param arr the integer array whose values must be displayed
	 * @return none
	 * @throws ArrayIndexOutOfBoundsException and logs the exception to a file 
	 */

	public void displayArrayValues(int[] arr) throws ArrayIndexOutOfBoundsException
	{
		//getting logger object
		Logger logger = Logger.getLogger(this.getClass());
		try
		{
			//logging the message for logging level "info"
			logger.info("The maximum array index is always one less than length of the array");

			for(int index=0; index<=7; index++)       //throws AIOB exception
			{
				if(index==arr.length-1)
				{
					//logging the message for logging level "warn"
					logger.warn("The array index value has reached maximum value of (array_length-1)");

				}

				System.out.println(arr[index]);
			}
		}
		catch(ArrayIndexOutOfBoundsException exception) //AIOB exception is handled
		{
			//logging the message for logging level "error"
			logger.error(exception.getMessage(), exception);

			//logging the message for logging level "fatal"
			logger.fatal("The method execution was unsuccessful, program terminated");
		}
	}

}

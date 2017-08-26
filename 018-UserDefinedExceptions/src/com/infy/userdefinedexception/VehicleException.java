package com.infy.userdefinedexception;
// Creates user defined exception
@SuppressWarnings("serial")
public class VehicleException extends Exception{

	public VehicleException(String message)
	{
		super(message);
	}
}

package com.infy.userdefinedexception;

/**
 * @author ETA
 */
public class Vehicle {
	private static double vehicleSpeed;

	public Vehicle(double speed) {
		vehicleSpeed = speed;
	}
	
	public static double getVehiclespeed() {
		return vehicleSpeed;
	}

	public static void setVehiclespeed(double vehiclespeed) {
		vehicleSpeed = vehiclespeed;
	}

	public void accelerate(double speed) throws VehicleException
	{
		if(vehicleSpeed+speed > 125.0)   //Assuming maximum speed of the vehicle is 125kmph
		{
			throw new VehicleException("Speed cannot be more than 125kmph");  //throwing custom exception
		}
		else
		{
			vehicleSpeed = vehicleSpeed + speed;
			
		}
	}

	public void decelerate(double speed) throws VehicleException
	{
		if(vehicleSpeed-speed <0)  //speed cannot be less than zero
		{
			throw new VehicleException("Speed cannot be less than 0kmph");
		}

		vehicleSpeed = vehicleSpeed - speed;
		
	}
}

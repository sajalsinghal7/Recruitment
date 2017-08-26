package com.infy.userdefinedexception;

/**
 * @author ETA
 */
public class VehicleTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle1 = new Vehicle(20.0);
		try
		{
			vehicle1.accelerate(100.25);
			System.out.println("The speed of the vehicle is increased to " + Vehicle.getVehiclespeed()  + "kmph");
			vehicle1.decelerate(25.0);
			System.out.println("The speed of the vehicle is decreased to " + Vehicle.getVehiclespeed() + "kmph");
		}
		catch(VehicleException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}

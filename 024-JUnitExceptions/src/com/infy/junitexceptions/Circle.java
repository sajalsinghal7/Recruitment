package com.infy.junitexceptions;

public class Circle 
{
	private double radius;
	private double area;
	private final double PI = 3.14;
	
	public Circle()
	{
		radius = 0.0;
		area = 0.0;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Calculates the area of the circle.
	 * @param rad a double that specifies radius value.
	 * @return None 
	 * @exception IllegalArgumentException, if radius is negative
	 */
	public void calculateArea(double rad) throws IllegalArgumentException
	{
		if(rad < 0)
		{
			throw new IllegalArgumentException("Invalid radius, it cannot be negative");
		}
		area = PI * rad * rad;
		System.out.println("The area of the circle is"+ area);
	}
}

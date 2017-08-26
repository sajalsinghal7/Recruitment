package com.infy.junitexceptions;

import org.junit.Test;

public class CircleTest {

	@Test(expected = IllegalArgumentException.class)
	public void testValidateRadius2() throws Exception {
		Circle circle = new Circle();
		circle.calculateArea(-11.6);
	}
}

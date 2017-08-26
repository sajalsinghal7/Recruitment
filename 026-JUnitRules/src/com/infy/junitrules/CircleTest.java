package com.infy.junitrules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CircleTest {
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	@Test
	public void testValidateRadius1() throws Exception {
	expectedException.expectMessage("Invalid radius, it cannot be negative");
		Circle circle = new Circle();
		circle.calculateArea(-11.6);

	}
	@Test(expected = IllegalArgumentException.class)
	public void testValidateRadius2() throws Exception {
		Circle circle = new Circle();
		circle.calculateArea(-11.6);
	}
}
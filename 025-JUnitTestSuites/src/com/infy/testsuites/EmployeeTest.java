package com.infy.testsuites;

import org.junit.Test;

import junit.framework.Assert;

public class EmployeeTest {
	
	
	@Test
	public void testForNull()
	{
		Employee emp = new Employee();
		Assert.assertNull(emp.getEmpName());
	}
	
	@Test
	public void testForNotNull()
	{
		Employee employee = new Employee(101, "John");
		Assert.assertNotNull(employee.getEmpName());
	}
}

package com.infy.testsuites;

import junit.framework.Assert;
import org.junit.Test;

public class MathUtilityTest 
{
	@Test
	public void isPrimeNumber1() 
	{
		Assert.assertTrue(MathUtility.checkIsPrime(31));
		
	}
	
	@Test
	public void isPrimeNumber2() 
	{
		Assert.assertFalse(MathUtility.checkIsPrime(21));
	}
	
	
	@Test
	public void isEvenOrOddNumber1()
	{
		Assert.assertEquals(0, MathUtility.checkEvenOrOdd(20));
	}
	
	
	
	@Test
	public void isEvenOrOddNumber2()
	{
		Assert.assertEquals(1, MathUtility.checkEvenOrOdd(23));
	}
}

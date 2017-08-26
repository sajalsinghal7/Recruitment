package com.infy.junit;

public class Employee {
	
	private int empNo;
	private String empName;
	
	
	public Employee()
	{
		this.empName = null;
		this.empNo = 0;
	}
	
	public Employee(int empNo , String empName)
	{
		this.empName = empName;
		this.empNo = empNo;
	}
	
	public int getEmpNo() 
	{
		return empNo;
	}
	public void setEmpNo(int empNo) 
	{
		this.empNo = empNo;
	}
	public String getEmpName() 
	{
		return empName;
	}
	
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
}

package com.infy.resources;

import com.infy.business.service.UserServiceImpl;
import com.infy.dao.UserDAOImpl;

public class Factory {

	public static UserServiceImpl createUserService()
	{
		return new UserServiceImpl();
	}
	
	public static UserDAOImpl createUserDAO()
	{
		return new UserDAOImpl();
	}
}
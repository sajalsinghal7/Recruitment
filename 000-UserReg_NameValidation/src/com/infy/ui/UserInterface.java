package com.infy.ui;

import com.infy.bean.User;
import com.infy.business.service.UserService;
import com.infy.resources.Factory;

/**
 * Creates the user object and calls the methods in the Service class.
 * This is a temporary class and will be replaced once the 
 * client tier is developed
 * @author ETA
 */

public class UserInterface {
	
	public static void main(String[] args) {
		
		addUser();
	}
	
	public static void addUser()
	{
		// Creating the user and setting the details
		User user = new User();
		user.setUserName("inFo@xyz.com");
		
		UserService userService = Factory.createUserService();
		String uName = userService.addUser(user);
		if(uName == null)
			System.out.println("Invalid Input");
		else
			System.out.println("User successfully added with username: " + userService.addUser(user));
	}
}

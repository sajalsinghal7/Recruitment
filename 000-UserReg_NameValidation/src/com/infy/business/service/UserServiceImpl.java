package com.infy.business.service;

import com.infy.bean.User;
import com.infy.business.validator.Validator;
import com.infy.dao.UserDAO;
import com.infy.resources.Factory;


/**
 * Service class to execute business logic
 * @author ETA
 */

public class UserServiceImpl implements UserService {
	/**
	 * Adds user to the database
	 * @param user, the user to be added
	 * @return The user name of the newly added user
	 */
public String addUser(User user) {
		
		//Check the business rules
		Validator validator = new Validator();
		boolean isValid = validator.validate(user);
		
		if(isValid)
		{
			// If data is valid, generate a suitable password
			user.setPassword("infy@123");
		
			// Add the user
			UserDAO dao = Factory.createUserDAO();
			return dao.addUser(user);
		}
		else return null;
	}
}

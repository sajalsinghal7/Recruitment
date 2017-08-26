package com.infy.dao;

import com.infy.bean.User;

/**
 * DAO class to perform database operations
 * @author ETA
 */

public class UserDAOImpl implements UserDAO {
	
	/**
	 * Adds user to the database
	 * @param user, the user to be added
	 * @return The user name of the newly added user
	 */
	
	public String addUser(User user) {
		
		// Add user to the database
		return user.getUserName();
	}
}

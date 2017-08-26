package com.infy.business.validator;

import com.infy.bean.User;

/**
 * Validates user
 * @author ETA
 */

public class Validator {
	/**
	 * Validates the user
	 * @param user
	 * @return None
	 */
	public boolean validate(User user) {

		/* Since Exception Handling course has not yet been covered, the return type of this method
		has been changed from void to boolean for demonstrative purpose. */
		
		// Use isValidUserName to check if the username of the user is valid or not
		
		boolean isValid = true;
		
		if(!isValidUserName(user.getUserName()))
			isValid = false;
		
		return isValid;
	}

	/**
	 * Validates the user name
	 * @param userName the user name to be validated
	 * @return false if user name is a reserved 
	 * name (info, webmaster, web-master) or else true
	 */
	public boolean isValidUserName(String userName) {
		boolean isValid = true;
		int indexOfAt = userName.indexOf('@');
		String name = userName.substring(0, indexOfAt);
		if (name.equals("info") || name.equals("webmaster") || name.equals("web-master")) {
			isValid = false;
		}
		return isValid;
	}
}

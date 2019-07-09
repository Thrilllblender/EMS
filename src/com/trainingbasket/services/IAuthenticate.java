package com.trainingbasket.services;

import java.util.List;

import com.trainingbasket.modals.User;

public interface IAuthenticate {
	
	List<User> getAllUsers();
	/**
	 * @param user expected to be populated from the UI layer
	 * @return
	 */
	boolean login(User user);

	/**
	 * @param user
	 * @return
	 */
	User signUp(User user);

	/**
	 * @param user
	 * @return
	 */
	User resetPassword(User user);

	/**
	 * @param user
	 * @return
	 */
	User updateProfile(User user);
}

package com.trainingbasket.services;

import java.util.ArrayList;
import java.util.List;

import com.trainingbasket.modals.User;

public class Authenticate implements IAuthenticate {

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(User user) {
		List<User> usersFromDAO = new ArrayList<User>();// from DAO -> DB
		for (User user2 : usersFromDAO) {
			if (user2.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public User signUp(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User resetPassword(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateProfile(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.universal.dao;

import com.universal.model.User;

public interface UserDao {

	boolean checkUser(User user);
	boolean addNewUser(User user);
}

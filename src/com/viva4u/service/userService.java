package com.viva4u.service;

import java.util.List;

import com.viva4u.pojo.User;

public interface userService {
	public List<User> listUserService();
	public User getUserByNameService(String name);
}	

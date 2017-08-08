package com.viva4u.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva4u.mapper.UserMapper;
import com.viva4u.pojo.User;
import com.viva4u.service.userService;
@Service
public class userServiceImpl implements userService{
	@Autowired
	UserMapper userMapper;
	public List<User> listUserService(){
		return userMapper.listUser();
	};
	public User getUserByNameService(String name) {
		return userMapper.getUserByName(name);
	}
}

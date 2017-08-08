package com.viva4u.mapper;

import java.util.List;
import java.util.Map;

import com.viva4u.pojo.User;

public interface UserMapper {
	public void addUser(User user);
	public void delUser(String name);
	public void updateUserPwd(Map<String, String> map);
	public User getUserByName(String name);
	public List<User> listUser();
}

package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.model.User;

@Service	
public class UserServiceImpl implements UserService{

	List<User> userList = new ArrayList<User>();
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		
		return userList;
	}

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		userList.add(user);
		return "New user added succesfully...";
	}
	

}

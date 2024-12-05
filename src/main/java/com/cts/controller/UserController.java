package com.cts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.User;
import com.cts.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
//	List<User>userList = new ArrayList<User>();
	@GetMapping("/retrive")
	public List<User> getUsers()
	{
		return userService.getAllUser();
		
	}
	
	@PostMapping("/add")
	public String addUsers(@RequestBody User user)
	{
		return userService.addUser(user);
//		return "Users added Successfully";
	}
	
	@DeleteMapping("/delete")
	public String deleteUser()
	{
		
		return "User Deleted Sucessfully";
	}
	
	
	

}

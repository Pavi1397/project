package com.deloitte.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.project.model.UserDetails;
import com.deloitte.project.service.UserDetailsService;
import com.deloitte.project.util.UserNameNotFoundException;

@RestController
public class UserController {
	
	@Autowired
	UserDetailsService service;

	int port =0;
	
	@GetMapping("/user/add")
	public String addUser(@RequestBody UserDetails userNew){
		UserDetails user1= service.addUser(userNew);
		if (user1 == null) {
			throw new UserNameNotFoundException("Invalid Username");
		}
		user1.setPort(port);
		return "signup.jsp";
	}
	
	@GetMapping("/user/{userName}")
	public ResponseEntity<UserDetails> getUserByUserName(@PathVariable("userName")String userName) {
		
		UserDetails user1= service.getUser(userName);
		if (user1 == null) {
			return new ResponseEntity<UserDetails>(HttpStatus.NOT_FOUND);
		}
		user1.setPort(port);
		return new ResponseEntity<UserDetails>(user1,HttpStatus.OK);
		
	}
	@GetMapping("/user/getAll")
	public ResponseEntity<List<UserDetails>> getAllUsers()
	{
		List<UserDetails> users = service.getAllUsers();
		ResponseEntity<List<UserDetails>> rt = new ResponseEntity<List<UserDetails>>(users, HttpStatus.OK);
		return rt;
	}

}
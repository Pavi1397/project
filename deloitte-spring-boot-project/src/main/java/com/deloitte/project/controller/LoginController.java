package com.deloitte.project.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.deloitte.project.model.UserDetails;
import com.deloitte.project.service.UserDetailsService;

@RestController
public class LoginController {
	
		@Autowired
		UserDetailsService service;

		int port =0;
		@GetMapping("/login")
		public UserDetails getUserByUserNameAndPassword(@RequestParam("userName")String userName, @RequestParam("password") String password,Model m) {
			return service.getUserByUserNameAndPassword(userName, password);
		}
}

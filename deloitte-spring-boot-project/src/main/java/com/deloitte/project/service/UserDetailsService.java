package com.deloitte.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.project.model.UserDetails;
import com.deloitte.project.repo.UserRepo;
import com.deloitte.project.util.UserAlreadyExistsException;
import com.deloitte.project.util.UserNameNotFoundException;

@Service
public class UserDetailsService{
	
	@Autowired
	UserRepo repo;
	
	public UserDetails addUser(UserDetails userNew) {
		if(repo.findByUserName(userNew.getUserName())!=null) {
			throw new UserAlreadyExistsException("Already exists.");
		}
		return repo.save(userNew);
	}
	
	public UserDetails getUser(String userName) {
		UserDetails user = repo.findByUserName(userName);
		if (user == null) {
      	throw new UserNameNotFoundException("Invalid Username");
      }
      return user;
  }
	public List <UserDetails> getAllUsers() {
		List <UserDetails> users = repo.findAll();
      return users;
  }
	public UserDetails getUserByUserNameAndPassword(String userName,String password) {
		UserDetails user = repo.findUserByUserNameAndPassword(userName,password);
		if (user == null) {
      	throw new UserNameNotFoundException("Invalid Username or Password");
      }
      return user;
  }
}



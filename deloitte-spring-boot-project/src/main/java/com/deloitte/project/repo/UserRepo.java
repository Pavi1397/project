package com.deloitte.project.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.deloitte.project.model.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails,Integer>{
	@Query("from UserDetails where userName=:userName")
	UserDetails findByUserName(String userName);
	@Query("from UserDetails where userName=:userName and password=:password")
	UserDetails findUserByUserNameAndPassword(String userName, String password);


}

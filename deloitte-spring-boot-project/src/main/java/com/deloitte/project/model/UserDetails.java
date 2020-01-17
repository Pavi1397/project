package com.deloitte.project.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class UserDetails {
	@Id @GeneratedValue(strategy = GenerationType.AUTO )
	
	private int id;
	private String email;
	private String userName;
	private String password;
	private String passwordFinal;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate dob;
	private int port;
	

	public UserDetails() {
		
	}
	
	public UserDetails(String email, String userName, String password, String passwordFinal, String firstName,
			String lastName, String gender, LocalDate dob) {
		
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.passwordFinal = passwordFinal;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordFinal() {
		return passwordFinal;
	}
	public void setPasswordFinal(String passwordFinal) {
		this.passwordFinal = passwordFinal;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}

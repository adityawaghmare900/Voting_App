package com.example.VotingApp.demo.VotingApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.executable.ValidateOnExecution;

import org.springframework.validation.annotation.Validated;

@Entity
@Table(name = "user")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pass;
	private String email;
	private String phoneNumber;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public UserModel(int id, String pass, String email, String phoneNumber) {
		super();
		this.id = id;
		this.pass = pass;
		this.email = email;
		this.phoneNumber = phoneNumber;
//		this.vote = vote;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", pass=" + pass + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	


}

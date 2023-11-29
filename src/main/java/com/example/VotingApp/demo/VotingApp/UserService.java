package com.example.VotingApp.demo.VotingApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	//for users
	public void saveUser(UserModel uModel) {
		userRepository.save(uModel);
	}
	
	public int topVote() {
		return userRepository.findTopN();
	}
	
	public List<UserModel> getall(UserModel userModel) {
		return userRepository.findAll();
	}
	
	public UserModel registerUser(UserModel model) {
		 userRepository.save(model);
		 return null;
		
	}
	
	
}

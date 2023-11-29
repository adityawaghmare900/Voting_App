package com.example.VotingApp.demo.VotingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CanService {
	
	@Autowired
	CanRepository canRepository;
	public void saveVote(Candidates candidates) {
		canRepository.save(candidates);
	}

}

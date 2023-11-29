package com.example.VotingApp.demo.VotingApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CanRepository extends JpaRepository<Candidates, Integer> {

	
}

package com.example.VotingApp.demo.VotingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	
//	@Query("select vote,Count(*) as Count from UserModel GROUP By vote")
//	public List<UserModel> seeVote(UserModel model);

//	@Query(value = "SELECT email FROM user order by email DESC limit 1", nativeQuery = true)
//	public String findTopN();
//	SELECT vote,COUNT(*) as Totalcount FROM candidates group by vote;
}
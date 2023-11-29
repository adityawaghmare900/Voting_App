package com.example.VotingApp.demo.VotingApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

	UserModel findByEmail(String email);

//	@Query("select vote,Count(*) as Count from UserModel GROUP By vote")
//	public List<UserModel> seeVote(UserModel model);

	@Query(value = "SELECT id FROM user order by id DESC limit 1", nativeQuery = true)
	public int findTopN();

}

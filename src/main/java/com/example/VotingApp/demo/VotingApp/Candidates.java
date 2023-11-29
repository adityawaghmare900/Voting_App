package com.example.VotingApp.demo.VotingApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidates {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vote;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVote() {
		return vote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}
	public Candidates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidates(int id, String vote) {
		super();
		this.id = id;
		this.vote = vote;
		
	}
	@Override
	public String toString() {
		return "Candidates [id=" + id + ", vote=" + vote + "]";
	}
	
}

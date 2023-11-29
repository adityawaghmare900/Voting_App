package com.example.VotingApp.demo.VotingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
	UserService service;
	@Autowired
	UserRepository repository;
	@Autowired
	CanService canService;
	

	@RequestMapping("/")
	public String home() {
		return "thanks";
	}

	@RequestMapping("registration")
	public String showPage() {
		return "registration";
	}

	@GetMapping("/login")
	public String showreg() {
		return "login";
	}

	@RequestMapping("register")
	public String register(UserModel user, Model model) {
		UserModel u = repository.findByEmail(user.getEmail());
		String vote = "<h3>" + "Already Voted By The Email" + "<h3>" + "<p>" + user.getEmail();
		if (u != null) {
			model.addAttribute("vote", vote);
			return "exist";
		}

		String s = "registerd Email is=" + user.getEmail() + "<br>" + "registerd Number is=" + user.getPhoneNumber();
		model.addAttribute("add", s);
		service.registerUser(user);
		System.out.println("data saved");
		return "login";
	}

	@PostMapping("login")
	public String afterLogin(UserModel user, Model model) {
		UserModel mo = repository.findByEmail(user.getEmail());

		if (mo!=null) {
		return "listOfCandidate";
		}
		return "exists";

	}

	@PostMapping("votForCandidate")
	public String saveVotes(Candidates candidates, Model model) {
		System.out.println("method called");
		canService.saveVote(candidates);
		return "logout";
	}

	@GetMapping("getallvote")
	public String getAll() {
		return "getallvote";
	}


}

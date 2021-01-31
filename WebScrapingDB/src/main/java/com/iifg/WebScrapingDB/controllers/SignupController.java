package com.iifg.WebScrapingDB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iifg.WebScrapingDB.entities.User;
import com.iifg.WebScrapingDB.repositories.UserRepository;

@Controller
@RequestMapping("/signup")
public class SignupController {

	private UserRepository userRepository;
	
	@Autowired
	public SignupController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "OK";
	}
	
	@PostMapping("/add")
	public @ResponseBody String addUser (@RequestParam String username, @RequestParam String password, @RequestParam String email) {
		User newUser = new User(username, password, email);
		userRepository.save(newUser);
		return "Saved";
	}
}	


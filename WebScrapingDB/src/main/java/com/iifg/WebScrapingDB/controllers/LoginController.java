package com.iifg.WebScrapingDB.controllers;

import java.util.List;

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
@RequestMapping("/login")
public class LoginController {

	private UserRepository userRepository;

	@Autowired
	public LoginController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "OK";
	}

	@PostMapping("/adduser")
	public @ResponseBody String addUser(@RequestParam String username, @RequestParam String password,
			@RequestParam String email) {
		String result = "";
		try {
			User newUser = new User(username, password, email);
			userRepository.save(newUser);
			result = "Saved";
		} catch (Exception e) {
			System.out.println("There was an error adding a new user.");
			result = "Failed";
		}
		return result;
	}

	@PostMapping("")
	public @ResponseBody String checkUser(@RequestParam String username, @RequestParam String password) {
		String result = "";
		List<User> userList = userRepository.findByName(username);
		System.out.println(userList);
		if (!userList.isEmpty()) {
			if (userList.get(0).getPassword().equals(password)) {
				result = "OK";
				System.out.println("OK");
			}
		} else {
			result = "Not found.";
			System.out.println("Not found.");
		}
		return result;
	}

}

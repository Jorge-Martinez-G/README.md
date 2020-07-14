package com.j5tech.SpringBootRefinitivApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import com.j5tech.SpringBootRefinitivApp.entity.User;
//import com.j5tech.SpringBootRefinitivApp.entity.Account;
import com.j5tech.SpringBootRefinitivApp.repository.AccountRepository;
import com.j5tech.SpringBootRefinitivApp.service.UserService;

 @Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	AccountRepository accountRepository;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/userForm")
	public String userForm(Model model) {
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("accounts",accountRepository.findAll());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}	
}
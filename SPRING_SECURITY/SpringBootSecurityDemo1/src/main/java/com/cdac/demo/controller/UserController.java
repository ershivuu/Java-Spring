package com.cdac.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String index() {
		return "home";
	}
	
	@GetMapping("/protectedByUserRole")
	public String userPage() {
		return "index_user";
	}
	
	@GetMapping("/protectedByAdminRole")
	public String adminPage() {
		return "index_admin";
	}
	
	@GetMapping("/notprotected")
	public String notProtected() {
		return "index_everyone";
	}
}


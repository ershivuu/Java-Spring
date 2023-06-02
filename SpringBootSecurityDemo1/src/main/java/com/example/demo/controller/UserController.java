package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String index() {
		return "home";
	}
	
	@GetMapping("/protectedByUserRole")
	public String user() {
		return "index_user";
	}
	
	@GetMapping("/protectedByAdminRole")
	public String admin() {
		return "index_admin";
	}
	
	@GetMapping("/notprotected")
	public String np() {
		return "index_everyone";
	}
}

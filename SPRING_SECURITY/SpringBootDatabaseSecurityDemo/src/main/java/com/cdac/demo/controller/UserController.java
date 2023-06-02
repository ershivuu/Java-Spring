package com.cdac.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class UserController {

	@GetMapping("/")
	public String index() {
		return "home";
	}
	
	@GetMapping("/403")
	public String error() {
		return "issue";
	}
	
	@GetMapping("/new")
	public String newProduct() {
		return "new_product";
	}

	@GetMapping("/edit")
	public String editProduct() {
		return "edit_product";
	}
	
	@GetMapping("/delete")
	public String deleteProduct() {
		return "delete_product";
	}
}







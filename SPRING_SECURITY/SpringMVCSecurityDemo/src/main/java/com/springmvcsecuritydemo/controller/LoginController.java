package com.springmvcsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/")
	public ModelAndView welcome()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("welcomepage");
		return model;
	}
	
	@RequestMapping("/homepage")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("homepage");
		return model;
	}
	
	@RequestMapping("/loginform")
	public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
	@RequestParam(value = "logout",	required = false) String logout) {
		
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addObject("message", "Logged out from site successfully.");
		}

		model.setViewName("loginpage");
		return model;
	}

}






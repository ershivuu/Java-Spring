package com.universal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = "/accept" , 
			method = RequestMethod.POST)
	public ModelAndView checkUser(
			@RequestParam("username") String uname , 
	@RequestParam("password") String pass) 
	{
		ModelAndView mv = null;
		
		if(uname.equals("ABC@gmail.com") && 
				pass.equals("ABC@123")) 
		{	
			mv = new ModelAndView("home", "USERNAME", uname);
		}
		else 
		{
			mv = new ModelAndView("error", "", null);
		}
			
		return mv;
	}
}






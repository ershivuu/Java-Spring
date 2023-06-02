package com.universal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.universal.dao.UserDao;
import com.universal.pojo.User;

@Controller
public class UserController {

	@Autowired
	private UserDao daoImpl;
	
	@RequestMapping(value = "/accept" , 
			method = RequestMethod.POST)
	public ModelAndView accept(User user) {
		
		ModelAndView mv = null;
		
		if(daoImpl.checkUserCredentials(user)) {
			mv = new ModelAndView("home", "USERNAME" ,
					user.getUsername());
		} 
		else
		{
			mv = new ModelAndView("error", "", null);
		}
		
		return mv;
	}
	
	@RequestMapping(value = "/reguser" , 
			method = RequestMethod.POST)
	public ModelAndView reguser(User user) {
		
		ModelAndView mv = null;
		
		if(daoImpl.addNewUser(user)) {
			mv = new ModelAndView("successregister", "MSG" ,
					"successful registration");
		} 
		else
		{
			mv = new ModelAndView("errorregister", "MSG" ,
					"registration failed");
		}
		
		return mv;
	}
}







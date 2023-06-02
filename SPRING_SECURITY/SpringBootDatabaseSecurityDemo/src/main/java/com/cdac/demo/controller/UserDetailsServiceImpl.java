package com.cdac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.cdac.demo.pojo.User;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired 
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		User user = repository.getUserByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("username invalid");
		
		return new MyUserDetails(user);
	}
}







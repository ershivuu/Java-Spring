package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
				extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(
AuthenticationManagerBuilder mgr) throws Exception {
			
		mgr.inMemoryAuthentication()
		   .withUser("devuser")
		   .password("{noop}user@123")
		   .authorities("ROLE_USER")
		   .and()
		   .withUser("devadmin")
		   .password("{noop}admin@123")
		   .authorities("ROLE_USER","ROLE_ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) 
			throws Exception 
	{
		http.authorizeHttpRequests()
			.antMatchers("/","/notprotected").permitAll()
			.antMatchers("/protectedByUserRole")
			.hasRole("USER")
			.antMatchers("/protectedByAdminRole")
			.hasRole("ADMIN")
			.and()
			.httpBasic();
	}
}




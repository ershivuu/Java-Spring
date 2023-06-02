package com.cdac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	//Authentication process
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder mgr)
	throws Exception {
		
		mgr.inMemoryAuthentication()
		   .withUser("devuser")
		   .password("{noop}dev@123").authorities("ROLE_USER")
		   .and()
		   .withUser("adminuser")
		   .password("{noop}admin@123")
		   .authorities("ROLE_USER","ROLE_ADMIN");
	}
	
	//Authorization process
	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
				.antMatchers("/","/notprotected").permitAll()
			.antMatchers("/protectedByAdminRole").hasRole("ADMIN")
			.antMatchers("/protectedByUserRole").hasRole("USER")
			.and()
			.httpBasic();
	}
}














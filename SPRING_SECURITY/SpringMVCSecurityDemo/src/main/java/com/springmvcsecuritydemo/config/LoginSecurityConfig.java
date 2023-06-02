package com.springmvcsecuritydemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter 
{
	//Authentication
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder mgr) throws Exception
	{
	 	mgr
		.inMemoryAuthentication()
		.withUser("anil.kishore")
		.password("anil@123")
		.authorities("ROLE_USER");
	}

	//Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http
		.authorizeRequests()
		.antMatchers("/homepage").hasRole("USER")
		.and()
		.formLogin().loginPage("/loginform")
		.defaultSuccessUrl("/homepage")
		.failureUrl("/loginform?error")
		.usernameParameter("username")
		.passwordParameter("password")
		.and()
		.logout().logoutSuccessUrl("/loginform?logout");
	}
	
}







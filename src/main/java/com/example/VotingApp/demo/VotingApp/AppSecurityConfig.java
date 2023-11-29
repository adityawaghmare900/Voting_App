//package com.example.VotingApp.demo.VotingApp;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@SuppressWarnings("deprecation")
//@Configuration
//@EnableWebSecurity
//public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("**********");
//		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//
//		http.csrf().disable();
//		System.out.println("called this page");
//	}
//
//}

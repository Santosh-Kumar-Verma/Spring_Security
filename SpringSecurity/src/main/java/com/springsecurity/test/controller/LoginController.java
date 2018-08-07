package com.springsecurity.test.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@EnableAutoConfiguration
@Controller
public class LoginController {

	@GetMapping(value = "/login")
	public String login(){
		return "login";
	}
	@GetMapping(value = "/")
	public String loginLounch(){
		return "login";
	}
	@GetMapping(value = "/registration")
	public String registration(){
		System.out.println("inside registration:");
		return "registration";
	}
	
}

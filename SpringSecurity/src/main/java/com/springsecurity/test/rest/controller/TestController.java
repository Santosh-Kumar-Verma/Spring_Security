package com.springsecurity.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.test.model.Student;
import com.springsecurity.test.service.ITestService;

@RestController
@RequestMapping(value = "/restAPI")
public class TestController {

	@Autowired
	private ITestService testService;
	
	@GetMapping(value = "/getAllStudent")
	public List<Student> getAllStudent(){
		return testService.getAllStudnet();
	}
}

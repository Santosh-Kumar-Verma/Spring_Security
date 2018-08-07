package com.springsecurity.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.test.model.Student;
import com.springsecurity.test.repository.StudentRepository;
import com.springsecurity.test.service.ITestService;

@Service
public class TestService implements ITestService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudnet() {
		return studentRepository.findAll();
	}
}

package com.springsecurity.test.scheduling.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@EnableAutoConfiguration
@Service
public class TestSchedulingService {

	
	public void sayHello() {
		for(int i=1;i<10;i++){
			System.out.println("Hello "+i);
		}
	}
}

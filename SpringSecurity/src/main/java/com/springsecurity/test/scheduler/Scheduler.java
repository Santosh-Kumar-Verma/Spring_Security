package com.springsecurity.test.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.springsecurity.test.scheduling.service.TestSchedulingService;

@Configuration
@EnableScheduling
public class Scheduler {

	@Autowired
	private TestSchedulingService testSchedulingService;
	
	@Scheduled(cron ="0 0/3 * ? * *")
	public void testScheduling()
	{
		testSchedulingService.sayHello();
		
	}
	
}

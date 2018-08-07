package com.springsecurity.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.springsecurity.test.*" } )
@EnableJpaRepositories("com.springsecurity.test.repository")
@EntityScan("com.springsecurity.test.model")
public class SpringSecurityApplication extends SpringBootServletInitializer {

   @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringSecurityApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
}

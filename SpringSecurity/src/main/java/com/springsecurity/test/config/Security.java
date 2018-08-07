package com.springsecurity.test.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableAutoConfiguration
@Configuration
public class Security extends WebSecurityConfigurerAdapter  {

	// Authentication : User --> Roles
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance())
			  .withUser("user1").password("secret1").roles("USER").and()
			  .withUser("admin2").password("secret2").roles("USER").and()
			  .withUser("santosh").password("admin@123").roles("USER","ADMIN");
		}

		// Authorization : Role -> Access
		protected void configure(HttpSecurity http) throws Exception {
			http.httpBasic().and().authorizeRequests()
			.antMatchers("/restAPI/**").hasRole("USER")
			.antMatchers("/**").hasRole("ADMIN")
			.and().csrf().disable().headers().frameOptions().disable();
		}
}

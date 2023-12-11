package com.org.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.org.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	MyUserDetailsService detailsService;	
	
	@Autowired
	public void auth(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(detailsService)
		    .passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests((req) ->
		                     req.antMatchers("/contact").permitAll()
		                        .anyRequest().authenticated()
				).formLogin();
		
		return http.build();
	}
}

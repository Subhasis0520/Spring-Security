package com.org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
		
		System.out.println("Spring securtiy apply...");

        http.authorizeHttpRequests((req) -> req.antMatchers("/contact","/about")
                .permitAll()
                .anyRequest()
                .authenticated()).formLogin();
		
		return http.build();
	}
}

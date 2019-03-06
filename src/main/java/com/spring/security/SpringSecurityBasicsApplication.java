package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.spring")
@EnableJpaRepositories("com.spring")
@EntityScan("com.spring")
public class SpringSecurityBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicsApplication.class, args);
	}

}

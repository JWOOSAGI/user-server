package com.von.userbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class UserBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserBackendApplication.class, args);
	}
}

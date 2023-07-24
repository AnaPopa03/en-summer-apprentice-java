package com.endava.java2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Java2023Application {

	public static void main(String[] args) {
		SpringApplication.run(Java2023Application.class, args);
	}

}

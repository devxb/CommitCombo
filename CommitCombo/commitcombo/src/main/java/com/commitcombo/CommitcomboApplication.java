package com.commitcombo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CommitcomboApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommitcomboApplication.class, args);
	}

}
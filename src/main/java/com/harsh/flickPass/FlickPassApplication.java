package com.harsh.flickPass;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FlickPassApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FlickPassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

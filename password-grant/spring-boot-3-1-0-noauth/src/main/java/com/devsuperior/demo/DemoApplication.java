package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Testando o PasswordEncoder

		String password = "1234567";
		System.out.println("ENCODER: " + passwordEncoder.encode(password));
		System.out.println("COMPARE: " + passwordEncoder.matches(password, "$2a$10$cCdAJTvnM7vJLe7RVKsH0eDsUIKE3jaCC3Uyp6x523IumnvZDEsjC"));
	}

}

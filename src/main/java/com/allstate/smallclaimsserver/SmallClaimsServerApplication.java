package com.allstate.smallclaimsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SmallClaimsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallClaimsServerApplication.class, args);
	}

}

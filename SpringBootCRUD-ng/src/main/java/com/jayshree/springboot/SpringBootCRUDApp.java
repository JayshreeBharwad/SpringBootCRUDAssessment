package com.jayshree.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.jayshree.springboot.configuration.JpaConfiguration;

/**
 * @author Jayshree
 *
 * @Created-on Jul 21, 2018
 *
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = { "com.jayshree.springboot" })
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}

}

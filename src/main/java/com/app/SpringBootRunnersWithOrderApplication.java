package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnersWithOrderApplication {
	public static void main(String[] args) {
		System.out.println("This is My Starter Class Before Run()....");
		SpringApplication.run(SpringBootRunnersWithOrderApplication.class, args);
		System.out.println("This is My Starter Class After Run()....");
	}
}

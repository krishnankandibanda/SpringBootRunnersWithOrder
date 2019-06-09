package com.app.runnerone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(15)	
public class OrderOne implements CommandLineRunner {
	public void run(String... args) throws Exception {
		System.out.println("This is My OrderOneRunner --- using_@Order(15)--Annotation ----- ");
	}
}

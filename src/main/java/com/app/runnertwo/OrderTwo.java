package com.app.runnertwo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class OrderTwo implements CommandLineRunner,Ordered {
	
	public int getOrder() {
		return 10;
	}
	public void run(String... args) throws Exception {
		System.out.println("This is My OrderTwoRunner --- using Ordered(interface)- 10 ----");
	}
}

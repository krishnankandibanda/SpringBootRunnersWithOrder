package com.app.runnerthree;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class OrderThree implements CommandLineRunner,Ordered {
	public int getOrder() {
		return 5;
	}
	public void run(String... args) throws Exception {
		System.out.println("This is My OrderThreeRunner --- using Ordered(interface)- 5 ----");
	}
}

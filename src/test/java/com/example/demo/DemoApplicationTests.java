package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = {"com.example.demo", "com.example.demo.controller"})
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

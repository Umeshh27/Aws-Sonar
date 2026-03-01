package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CseControllerTest {
	@Autowired
	CseController c;
	@Test
	void test() {
		int result = c.addCSE(12,13);
		assertEquals(25, result);
	}
	@Test
	void test1() {
		String results = c.roll();
		assertEquals("23MH1A05E7",results);
	}

}
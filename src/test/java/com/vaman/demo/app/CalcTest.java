package com.vaman.demo.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalcTest {

	@Test
	void testAddPositiveNumbers() {
		Calc calc = new Calc();
		int result = calc.addNums(10, 20);
		assertEquals(30, result);
	}

	@Test
	void testAddNegativeNumbers() {
		Calc calc = new Calc();
		int result = calc.addNums(-10, -20);
		assertEquals(-30, result);
	}

}

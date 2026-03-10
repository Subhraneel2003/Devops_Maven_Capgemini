package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	void testAddition() {
		Calculator obCalculator = new Calculator();
		int result = obCalculator.calculate(2, 3);
		assertEquals(5, result);
	}
}

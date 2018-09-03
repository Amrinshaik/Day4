package com.capgemini.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.President;

class PresidentTest {
  President p;
	
	@BeforeEach
	void setUp() {
		p = new President(400);
    }
	@Test
	void testnetSalaryCalculation() {
		assertEquals(3000, p.netSalaryCalculation(),0.04);
    }
	
	@AfterEach
	void tearDown() {
		p = null;
	}

}

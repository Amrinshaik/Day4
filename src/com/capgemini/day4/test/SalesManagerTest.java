package com.capgemini.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.SalesManager;

class SalesManagerTest {
	
	SalesManager sm;
	
	@BeforeEach
	void setUp() {
		sm = new SalesManager(1234, "John", 200000.0, 2000);
    }
	@Test
	void testnetSalaryCalculation() {
		assertEquals(325800, sm.netSalaryCalculation(),0.04);
    }
	
	@AfterEach
	void tearDown() {
		sm = null;
	}

}

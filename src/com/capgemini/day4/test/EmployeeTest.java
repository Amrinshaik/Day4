package com.capgemini.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.Employee;


class EmployeeTest {
      Employee employee;
      
      
		@BeforeEach
		void setUp() {
			employee = new Employee(1234, "John", 200000.0, 2000);
		}

		@Test
		void testNetSalaryCalculation() {
			assertEquals(277800.0, employee.netSalaryCalculation(),0.04);
		}

		@AfterEach
		void tearDown() {
			employee = null;
		}
}

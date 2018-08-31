package com.capgemini.day4;

public class Employee {
	    private int employeeId;
		private String employeeName;
		private String employeeAddress;
		private double employeePhone;
		private double basicSalary;
		private double salary;
		
		private final double SPECIALALLOWANCE=250.80;
		private final double HRA=1000.50;
		
		public Employee() {	
		}
		public Employee(int Id, String Name, String Address, double Phone) {
			employeeId=Id;
			employeeName=Name;
			employeeAddress=Address;
			employeePhone=Phone;
		}
		
		public double calculateSalary() {
			salary=basicSalary+(basicSalary*SPECIALALLOWANCE/100)+(basicSalary*HRA/100);
			return salary;	
		}
		
		
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeeAddress() {
			return employeeAddress;
		}
		public void setEmployeeAddress(String employeeAddress) {
			this.employeeAddress = employeeAddress;
		}
		public double getEmployeePhone() {
			return employeePhone;
		}
		public void setEmployeePhone(double employeePhone) {
			this.employeePhone = employeePhone;
		}
}

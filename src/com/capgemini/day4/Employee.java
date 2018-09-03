package com.capgemini.day4;

public class Employee {
	 private int empId;
		private String empName;
		private double hra;
		private double pf;
		private double medical;
		private double netSalary;
		private double basicSalary;
		private double grossSalary;
		
		private static final int PT=200;
		
		public Employee() {
			
		}

		public Employee(int empId, String empName, double basicSalary, double medical) {
			this.setBasicSalary(basicSalary);
			this.setMedical(medical);
			this.empId=empId;
			this.empName=empName;
		}



		public double netSalaryCalculation() {
			hra=0.5*basicSalary;
			pf=0.12*basicSalary;
			grossSalary=hra+basicSalary+medical;
			netSalary=grossSalary-(pf+PT);
			
			return netSalary;
			
		}
		public void displayEmployeeDetails(int empId, String empName, double netSalary) {
			System.out.println("EmployeeId" +empId+ "EmployeeName" +empName+ "Net Salary" +netSalary);
			
		}

		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}

		public double getGrossSalary() {
			return grossSalary;
		}

		public void setGrossSalary(double grossSalary) {
			this.grossSalary = grossSalary;
		}

		public double getMedical() {
			return medical;
		}

		public void setMedical(double medical) {
			this.medical = medical;
		}

		public double getHra() {
			return hra;
		}

		public void setHra(double hra) {
			this.hra = hra;
		}

		public double getPf() {
			return pf;
		}

		public void setPf(double pf) {
			this.pf = pf;
		}

		public static int getPt() {
			return PT;
		}

		public double getNetSalary() {
			return netSalary;
		}

		public void setNetSalary(double netSalary) {
			this.netSalary = netSalary;
		}

}

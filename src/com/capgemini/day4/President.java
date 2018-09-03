package com.capgemini.day4;

public class President extends Employee{
	
	private double tourAllowance;
	 private double telephoneAllowance;
	 
	 private double kilometersTravelled;
	 
	 
	public President() {
		super();
	}
	
	public President(double kilometersTravelled) {
		super();
		this.kilometersTravelled = kilometersTravelled;
		}
	 
    @Override
    public double netSalaryCalculation() {
		setHra(0.5*getBasicSalary());
		setPf(0.12*getBasicSalary());
		
		tourAllowance=8*kilometersTravelled;
		telephoneAllowance=0.13*getBasicSalary();
	
	setGrossSalary(getHra()+getBasicSalary()+getMedical()+telephoneAllowance+tourAllowance);
		setNetSalary(getGrossSalary()-(getPf()+getPt()));
		
		return getNetSalary();
}
}

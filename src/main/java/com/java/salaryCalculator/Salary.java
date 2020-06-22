package com.java.salaryCalculator;

public class Salary {
	
	private static double base_hours = 40.0;
	private static double overtimeRate = 1.5;
	//private static double base_pay = 10;
	
	
	private double hours,pay;

	
	public void setHours(double hours) {
		this.hours = hours;
	}

	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public double calculateGrossPay() {
		
		//if(hours>40)
			//pay = (base_pay*)
			
		return hours>40 ?
				(pay * base_hours) + ((pay * overtimeRate)*(hours-base_hours)):
					hours*pay;
				
	}
	

}

package com.java.salaryCalculator;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Salary salaryCalc = new Salary();
		
		
		for(int i = 1; i<4; i++) {
			System.out.printf("Employee %d weekly hours : " , i);
			salaryCalc.setHours(scan.nextDouble());
			
			System.out.printf("Employee %d hourly pay: " , i);
			salaryCalc.setHours(scan.nextDouble());
			
			System.out.printf("Employee %d gross pay : %.2f\n", i,salaryCalc.calculateGrossPay());
			
		}

	}

}

package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

import com.algonquin.cst8288.assignment1.controller.Rate;


public class PermanentEmployeeImpl implements EmployeeService {
	
	//I added fields to store employee salary, bonus and pension
	private double salary;
	private double bonus;
	private double pension;
	private int yearsOfServices;

	//Constructor 
    public PermanentEmployeeImpl(double salary, int yearsOfServices) {
    	  this.salary = salary;
    	    this.yearsOfServices = yearsOfServices;
    	    this.bonus = calculateBonus(yearsOfServices);
    	    this.pension = calculatePension();
    	}
    

	//getter method to get salary
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	//Overridden method to calculate the total compensation for permanent employee
	@Override
	public double calculateTotalCompensation(Employee employee) {
		// TODO Auto-generated method stub
		//total compensation = salary + bonus
		return salary + bonus;
	}

	// Method to calculate bonus. Bonus is 2.5% of base salary * years of service
	public double calculateBonus(int yearsOfServices) {
	    return salary * Rate.BONUS_PERCENTAGE * yearsOfServices;
	}

	//method to calculate pension. pension is 1% of the base salary
	private double calculatePension() {
		return salary * Rate.PENSION_PERCENTAGE;
	}
}

package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Calendar;
import java.util.Date;

public class ContractEmployeeImpl implements EmployeeService {
	
	
	//creating salary field to store contract employee's salary
	private double salary;
	
	//constructor to initantiate the contract employee with a salary
	public ContractEmployeeImpl (double salary) {
		this.salary=salary;
	}

	//overridden method to get salary 
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	// Overridden method to calculate total compensation
	@Override
	public double calculateTotalCompensation(Employee employee) {
		// TODO Auto-generated method stub
		return salary;
	}

	//overridden method to calculate renewal date for contract worker
	public Date renewalDate() {
		// Creating calendar instance and adding 1 year to the current data to get the renewal date
		
		Calendar calendar = Calendar.getInstance();
		// Renewal date is 1 year from today
        calendar.add(Calendar.YEAR, 1);   
        return calendar.getTime();
	
	}
}

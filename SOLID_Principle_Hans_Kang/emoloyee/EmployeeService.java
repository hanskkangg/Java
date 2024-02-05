package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * Hans's commnet: "Clients should not be forced to depend on interfaces they do not use."

In other words, it suggests that an interface should have a specific and narrow purpose,
and no client (i.e., a class or module that uses the interface) 
should be forced to implement methods it doesn't need or use.


Part1.2 I'm creating 2 new classes, PermanentEmployeeImpl.java and ContractEmployeeImp.java.
Ensuring that salary, bonus, pension, and renewal date are appropriately calculated based on the employee type. 

I'm deleting 

	public double pensionContribution(Employee employee);
	
	public double calculateBonus(Employee employee);
	
	Because bonus and pension are ONLY for permanent employee and contract employee doesn't have to implement those methods.
	
I'm creating public double getSalary(); because ALL employees receive a salary.

 * EmployeeService interface
 * 
 */
public interface EmployeeService {

	//Gets the salary of the employee
    double getSalary();
    //calculate total compensation for employee
    double calculateTotalCompensation(Employee employee);
}


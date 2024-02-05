	package com.algonquin.cst8288.assignment1.controller;
	
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	
	import com.algonquin.cst8288.assignment1.emoloyee.Employee;
	import com.algonquin.cst8288.assignment1.persistence.Formatter;
	import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
	import com.algonquin.cst8288.assignment1.controller.PersistenceService;
	
	/**
	 * Part 1.1 
	 * 
	 * Hans's Commnet: This class was performing 2 different methods. 1 - validate employee data and 2 - Saving employee data to a text file.
	 * to satisfy Single Responsibility Principle. I must create a new class and move one functionality to a new class that i created.
	 * 
	 * 
	 *  I'm creating two new classes called 'validateEmployee' to validate employee and 
	 *  another class 'saveEmployee' to save employee's data to a text file
	 * 
	 * Process, validate and save employee data.
	 * 
	 * 
	 */

public class EmployeeController {

	
    // Declaring fields for instances of classes

    private final ValidateEmployee validateEmployee;
    private final SaveEmployee saveEmployee;
	private final PersistenceService PersistenceService;

	// Constructor
    public EmployeeController(ValidateEmployee validateEmployee, SaveEmployee saveEmployee,PersistenceService persistenceService) {
        this.validateEmployee = validateEmployee;
        this.saveEmployee = saveEmployee;
        this.PersistenceService = persistenceService;
    }

    //Its a method to process an Employee
	public String processEmployee(Employee employee) {
		//check if employee is valid using validateEmployee instance
        if (!validateEmployee.isValidEmployee(employee)) {
            return "FAILED";
        }
        return "SUCCESS";
    }
	
	}
	
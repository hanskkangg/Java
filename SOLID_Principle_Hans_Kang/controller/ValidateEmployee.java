package com.algonquin.cst8288.assignment1.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;

public class ValidateEmployee {
	
	boolean isValidEmployee(Employee employee) {		
		//Hans comments: It checks if the employee's name is present, contains only alphanumeric characters, and trims any extra whitespace
		if (!isPresent(employee.getName())) {
			return false;
		}
		employee.setName(employee.getName().trim());

		if (!isValidAlphaNumeric(employee.getName())) {
			return false;
		}
		
		//Hans comments: It checks if the email address is present and follows a valid email format.
		if (employee.getEmail() == null || employee.getEmail().trim().length() == 0) {
			return false;
		}
		employee.setEmail(employee.getEmail().trim());
		if (!isValidEmail(employee.getEmail())) {
			return false;
		}
		
		//Hans comments: It checks if the salary, total compensation, and number of service years are greater than zero
		if (!isNoSalary(employee.getSalary())) {
			return false;
		}
		
		if (!isNoCompensation(employee.getTotalCompensation())) {
			return false;
		}
		
		if (!isNoServiceYear(employee.getNumberOfServiceYear())) {
			return false;
		}
		// Hans comments' If all checks pass, it returns true indicating the data is valid, otherwise, it returns false
		return true;
	}

	
	/**
	 * Check for null or empty
	 * 
	 * @param value
	 * @return
	 */
	private static boolean isPresent(String value) {
		return value != null && value.trim().length() > 0;
	}

	/**
	 * Check for special character	
	 * 
	 * @param value
	 * @return
	 */
	private static boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}

	/**
	 * Check for valid email address
	 * 
	 * @param value
	 * @return
	 */
	private static boolean isValidEmail(String value) {
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}
	
	/**
	 * Check for salary
	 * 
	 * @param salary
	 * @return
	 */
	private static boolean isNoSalary(double salary) {
		return salary <= 0 ? false : true ;
	}
	
	/**
	 * Check for total compensation
	 * 
	 * @param compensation
	 * @return
	 */
	private static boolean isNoCompensation(double compensation) {
		return compensation <= 0 ? false : true ;
	}
	
	/**
	 * Check number of service year.
	 * 
	 * @param serviceYear
	 * @return
	 */
	private static boolean isNoServiceYear(int serviceYear) {
		return serviceYear <= 0 ? false : true ;
	}
	

}

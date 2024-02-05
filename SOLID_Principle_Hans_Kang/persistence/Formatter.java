package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

public interface Formatter {
	
	//format provide employee's data into desired formats such as JSON format and Text Format
	public String format(Employee employee) throws IOException;
	
}


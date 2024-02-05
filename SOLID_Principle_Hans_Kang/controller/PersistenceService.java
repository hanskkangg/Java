package com.algonquin.cst8288.assignment1.controller;


import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

	//this class is responsible for saving employee data to a file using Formatter
public class PersistenceService {

	private final Formatter formatter;

	//Constructor with Formatter implementation
	public PersistenceService(Formatter formatter) {
		this.formatter = formatter;
	}	
	/**
	 * 
	 * save employee data to a file using provided formatter
	 * @param employee
	 * @throws IOException
	 * 
	 * 
	 */
	public void saveEmployee(Employee employee, String filename) throws IOException {
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
			writer.println(formatter.format(employee));
			writer.flush();
		}
	}
}

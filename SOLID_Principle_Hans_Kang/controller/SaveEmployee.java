package com.algonquin.cst8288.assignment1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;


	//This class coordinates the saving of employee data in JSON and text formats

public class SaveEmployee {
	// Static instances for handling JSON and text file.
    private static PersistenceService jsonPersistenceService;	
    private static PersistenceService textPersistenceService;
    
    
    //Constructor with JSON and text formats
    public SaveEmployee(PersistenceService jsonPersistenceService, PersistenceService textPersistenceService) {
        this.jsonPersistenceService = jsonPersistenceService;
        this.textPersistenceService = textPersistenceService;
    }
    
    
    //this class method is used to save employee data in JSON file and text file
    public static void saveEmployee(Employee employee, String jsonFilename, String textFilename) throws IOException {
        // Saving employee data in JSON format file
        jsonPersistenceService.saveEmployee(employee, jsonFilename);
        System.out.println("Saving employee data to file: " + jsonFilename);

        // Saving employee data in text format file
        textPersistenceService.saveEmployee(employee, textFilename);
        System.out.println("Saving employee data to file: " + textFilename);
    }
    
    //it's a method to save employee data in a text format
    public static void saveToText(Employee employee, String filename) throws IOException {
        Formatter formatter = new TextFormatter();
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(formatter.format(employee));
            writer.flush();
        }
    }
}

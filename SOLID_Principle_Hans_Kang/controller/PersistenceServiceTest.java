package com.algonquin.cst8288.assignment1.controller;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;


//This class tests the functionality of PersistenceService in handling employee data.
public class PersistenceServiceTest {

	//declare instances and the text file.
    private PersistenceService persistenceService;
    private Formatter formatter;
    private String filename = "test.txt";

    // Set up method that runs before each test. 
    @Before
    public void Setting() {
    	//Initialize a Formatter that formats an employee's data as "name, email".
        formatter = new Formatter() {
            @Override
            public String format(Employee employee) {
                return employee.getName() + ", " + employee.getEmail();
            }
        };
        // Initialize the PersistenceService with the above formatter.
        persistenceService = new PersistenceService(formatter);
    }

    //This method runs after each test. it clean up by deleting the test file.
    @After
    public void cleanUp() throws IOException {
        // Clean up the test file
        Files.deleteIfExists(Path.of(filename));
    }

    // Test method to check the saveEmployee functionality of PersistenceService.
    @Test
    public void testSaveEmployee() throws IOException {
        // create new employee instance set up name and email
        Employee employee = new Employee();
        employee.setName("DonaldDuck");
        employee.setEmail("DonaldDuck@gmail.com");

        // save the employee's data to a file
        persistenceService.saveEmployee(employee, filename);

        //Read the file and compare its content with the expected formatted string
        File file = new File(filename);
        String fileContent = Files.readString(file.toPath());
        String expectedFormattedEmployee = "DonaldDuck, DonalDuck@gmail.com\n";
    }
}


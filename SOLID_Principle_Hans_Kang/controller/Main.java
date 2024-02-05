package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.emoloyee.*;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Instantiate two Employee objects and populate them
        Employee permanentEmployee = new Employee();
        permanentEmployee.setName("HansKang");
        permanentEmployee.setEmail("kang0057@algonquinlive.com");
        permanentEmployee.setSalary(65000);
        permanentEmployee.setAddress("Ottawa,ON,Canada");
        permanentEmployee.setNumberOfServiceYear(10);

        Employee contractEmployee = new Employee();
        contractEmployee.setName("MickeyMouse");
        contractEmployee.setEmail("micky123@gmail.com");
        contractEmployee.setSalary(85000);
        contractEmployee.setAddress("Ottawa,ON,Canada");
        contractEmployee.setNumberOfServiceYear(5);

        // Calculate and populate data using EmployeeImpl classes
        PermanentEmployeeImpl permanentEmployeeService = new PermanentEmployeeImpl(permanentEmployee.getSalary(), permanentEmployee.getNumberOfServiceYear());
        permanentEmployee.setBonus(permanentEmployeeService.calculateBonus(permanentEmployee.getNumberOfServiceYear()));
        permanentEmployee.setTotalCompensation(permanentEmployeeService.calculateTotalCompensation(permanentEmployee));
        
        ContractEmployeeImpl contractEmployeeService = new ContractEmployeeImpl(contractEmployee.getSalary());
        contractEmployee.setTotalCompensation(contractEmployeeService.calculateTotalCompensation(contractEmployee));
        contractEmployee.setRenewalDate(contractEmployeeService.renewalDate());

        // Instantiate ValidateEmployee, PersistenceService, SaveEmployee
        ValidateEmployee validateEmployee = new ValidateEmployee();
        PersistenceService persistenceService = new PersistenceService(new JSONFormatter());
        SaveEmployee saveEmployee = new SaveEmployee(persistenceService, persistenceService);
        
        //Instantiate EmployeeController
        EmployeeController employeeController = new EmployeeController(validateEmployee, saveEmployee, persistenceService);

        // Process and display the results for Permanent Employee
        String result1 = employeeController.processEmployee(permanentEmployee);
        System.out.println("Processing Permanent Employee: " + result1);

        // Process and display the results for Contract Employee
        String result2 = employeeController.processEmployee(contractEmployee);
        System.out.println("Processing Contract Employee: " + result2);

        //Display information for the first employee and save it to files
        System.out.println("Permanent Employee:");
        SaveEmployee.saveEmployee(permanentEmployee, "json_employee_data_permanent.txt", "text_employee_data_permanent.txt");
        System.out.println(new TextFormatter().format(permanentEmployee));
        System.out.println();

        // Display information for the second employee and save it to files
        System.out.println("Contract Employee:");
        SaveEmployee.saveEmployee(contractEmployee, "json_employee_data.txt", "text_employee_data.txt");
        System.out.println(new TextFormatter().format(contractEmployee));
    }
}


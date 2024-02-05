package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;


//part 1.3 creating textfFormatter class to implement formatter to pair key-values.
public class TextFormatter implements Formatter{

	//overriden method of Formatter class. Provide employee's data into key-value pari text format
	@Override
	public String format(Employee employee) throws IOException {
		
        //Create StringBuilder to construct the formatted text.
		StringBuilder formatText = new StringBuilder();

		//Pairing key-values for specific attributes
		formatText.append("name=").append(employee.getName()).append(", ");
		formatText.append("email=").append(employee.getEmail()).append(", ");
		formatText.append("address=").append(employee.getAddress()).append(", ");
		formatText.append("salary=").append(employee.getSalary()).append(", ");
		formatText.append("numberOfServiceYear=").append(employee.getNumberOfServiceYear()).append(", ");
		formatText.append("bonus=").append(employee.getBonus()).append(", ");
		formatText.append("totalCompensation=").append(employee.getTotalCompensation()).append(", ");
		formatText.append("renewalDate=").append(employee.getRenewalDate());

        // Return the formatted string
        return formatText.toString();
	}

}

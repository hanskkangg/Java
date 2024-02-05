package assignment2;

import java.util.Scanner;

/**
 * File Name: Calculator.java
 * Student Name: Hans Kang, 040694631 
 * Professor: Fedor, Ilitchev
 * Due Date: Nov 26, 2023 
 * Modified: Nov 25, 2023 
 * Description: A calculator program that takes user input equations. it processes them using try-catch blocks to deal with exceptions.
 *
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see CalculatorEngine.java
 */

public class Calculator {
    
    /**
     * The main method of the Calculator program. It displays a welcome message.
     * It takes user input equations. it processes them using try-catch blocks to deal with exceptions.
     * 
     * @param args The command-line arguments (not used in this program).
     */
	
    public static void main(String[] args) {
        System.out.println("Welcome to the Assignment 2 CST8284 calculator.");
        System.out.println("Written by Hans Kang, #040694631");
        System.out.println("Equations are in the form num1 operator num2 =");
        System.out.println("Where num1 and num2 must be integers,");
        System.out.println("operator is one of +, -, /, or *");
        System.out.println("Enter 0 = to quit.");


        // Create Scanner 
        Scanner keyboard = new Scanner(System.in);


        // It's a while loop. it will continue taking user's input until the user enters "0 ="
        while (true) {
            System.out.print("Enter your equation: ");
            
            String buffer = keyboard.nextLine().trim();


        // Program stops when user input "0 ="
            if (buffer.startsWith("0 =")) {
                System.out.println("Program exiting.");
                break;
            }

            
            try {
            	// Process the entered equation
                equation(buffer);
            } catch (Exception error) {
                // Deal with exceptions and display error messages
                System.err.println("An unexpected error occurred: " + error.getMessage());
            }
        }
        
        keyboard.close();
    }
    

    /**
     * Process the entered equation and calculate the result.
     *
     * @param userInput The input equation string to be processed.
     * @throws IllegalArgumentException If the input equation is incomplete or contains invalid elements.
     * @throws ArithmeticException      If there is an arithmetic error during calculation.
     * 
     */private static void equation(String buffer) throws IllegalArgumentException, ArithmeticException {
    	    Scanner input = new Scanner(buffer);

    	    try {
    	        // Check if the equation has the first number
    	        if (!input.hasNext()) {
    	            throw new IllegalArgumentException("Error: Equation incomplete. First number is missing.");
    	        }

    	        // Check if the first input is an integer
    	        if (!input.hasNextInt()) {
    	            throw new IllegalArgumentException("Error: First input is not an integer. (NumberFormatException)");
    	        }

    	        // Get the first integer from the input
    	        int num1 = input.nextInt();

    	        // Check if the equation has an operator
    	        if (!input.hasNext()) {
    	            throw new IllegalArgumentException("Error: Equation incomplete. Operator is missing.");
    	        }

    	        // Get the operator from the input
    	        String sign = input.next();

    	        // Check if the operators are valid
    	        if (!"+-/*".contains(sign)) {
    	            throw new IllegalArgumentException("Error: Invalid operator. Valid operators are +, -, /, and *.");
    	        }

    	        // Check if the equation has the second number
    	        // Call stack until the second number been caught
    	        if (!input.hasNextInt()) {
    	            throw new IllegalArgumentException("Error: Second number is missing. (NumberFormatException)");
    	        }

    	        // Get the second integer from the input
    	        int num2 = input.nextInt();

    	        // Check if the equation ends with "="
    	        if (!buffer.endsWith("=")) {
    	            throw new IllegalArgumentException("Error: Equation incomplete. Equation must end with =.");
    	        }

    	        // Calculate result using CalculatorEngine
    	        int result = CalculatorEngine.calculate(num1, sign, num2);

    	        // Display the result
    	        System.out.println("That answer is: " + result);
    	        

    	        // Catch block for handling NumberFormatException
    	    } catch (NumberFormatException numberFormatException) {
    	    	
    	        String errorMessage = "Error: Something happened with a number! (" + numberFormatException.getClass().getSimpleName() + ")";
    	        System.err.println(errorMessage);
    	        
    	        
    	        // Catch block for handling any other unexpected exceptions
    	    } catch (Exception exception) {
    	        String errorMessage = "An unexpected error occurred: " + exception.getMessage() + " (" + exception.getClass().getSimpleName() + ")";
    	        System.err.println(errorMessage);
    	    }
     }
}
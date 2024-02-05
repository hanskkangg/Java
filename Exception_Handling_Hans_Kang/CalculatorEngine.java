package assignment2;

/**
 * File Name: CalculatorEngine.java
 * Student Name: Hans Kang, 040694631 
 * Professor: Fedor, Ilitchev
 * Due Date: Nov 26, 2023 
 * Modified: Nov 25, 2023 
 * Description: This class provide basic calculations such as plus, minus, multiplication, and division. 
 * It includes exception handling for division by zero.
 * 
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see Calculator.java
 */

public class CalculatorEngine {
	 /**
     * Performs basic calculations.
     *
     * @param num1     The first operand.
     * @param operator The arithmetic operator (+, -, *, /).
     * @param num2     The second operand.
     * @return The result of the operation.
     * @throws IllegalArgumentException If the operator is not one of the valid operators.
     */
    public static int calculate(int num1, String operator, int num2) {
        switch (operator) {
            case "+":	
                return plus(num1, num2);
            case "-":
                return minus(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                return divide(num1, num2);
            default:
                throw new IllegalArgumentException("Error: Invalid operator. Valid operators are +, -, /, and *.");
        }
    }
    
    /**
     * Adds two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of the two numbers.
     */
    private static int plus(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The result of the subtraction.
     */
    private static int minus(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The product of the two numbers.
     */
    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides the first number by the second number. Handles division by zero.
     *
     * @param num1 The numerator.
     * @param num2 The denominator.
     * @return The result of the division.
     * @throws ArithmeticException If attempting to divide by zero.
     */
    private static int divide(int num1, int num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero! Result is invalid, returning zero.");
            }
            return num1 / num2;
        } catch (ArithmeticException errors) {
        	
        	// Throw the exception
            throw errors; 
        }
    }
}

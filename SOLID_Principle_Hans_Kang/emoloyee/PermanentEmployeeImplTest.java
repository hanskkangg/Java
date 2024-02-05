package com.algonquin.cst8288.assignment1.emoloyee;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


//This class tests the functionality of the PermanentEmployeeImpl class.
public class PermanentEmployeeImplTest {
	
    // Test method to check the correctness of the calculateBonus method.
    @Test
    public void testCalculateBonus() {
    	// Create an instance with salary of 65000 and 10 years of service
        PermanentEmployeeImpl employee = new PermanentEmployeeImpl(65000, 10);
        //calculate bonus 
        double expectedBonus = 65000 * 0.025 * 10;
        // Assert that the calculated bonus by the employee instance matches the expected bonus.
        assertEquals(expectedBonus, employee.calculateBonus(10), 0.01);
    }

    // Test method to check the correctness of the calculateTotalCompensation method.
    @Test
    public void testCalculateTotalCompensation() {
    	//Create another instance with the same salary and years of service.
        PermanentEmployeeImpl employee = new PermanentEmployeeImpl(65000, 10);
        //Calculate the expected total compensation, which is the sum of the salary and the calculated bonus.
        double expectedTotalCompensation = 65000 + (65000 * 0.025 * 10);
        // Assert that the total compensation calculated by the employee instance matches the expected value.
        assertEquals(expectedTotalCompensation, employee.calculateTotalCompensation(null), 0.01);
    }
}

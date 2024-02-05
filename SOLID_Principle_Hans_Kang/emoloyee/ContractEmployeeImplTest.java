	package com.algonquin.cst8288.assignment1.emoloyee;
	
	import static org.junit.Assert.assertEquals;
	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.Test;

	import java.time.Duration;
	import java.util.Calendar;
	import java.util.Date;
	
	public class ContractEmployeeImplTest {
	
	    @Test
	    public void testGetSalary() {
	        // Create an instance of ContractEmployeeImpl
	        ContractEmployeeImpl employee = new ContractEmployeeImpl(85000);
	
	        // Use JUnit's assertEquals to compare the calculated salary with the expected value
	        assertEquals(85000.0, employee.getSalary(), 0.01);
	    }
	
	    @Test
	    public void testCalculateTotalCompensation() {
	        // Create an instance of ContractEmployeeImpl
	        ContractEmployeeImpl employee = new ContractEmployeeImpl(85000);
	        
	        // Calculate the expected total compensation (salary)
	        double expectedTotalCompensation = 85000;
	
	        // Use JUnit's assertEquals to compare the calculated total compensation with the expected value
	        assertEquals(expectedTotalCompensation, employee.calculateTotalCompensation(null), 0.01);
	    }

	    
	    @Test
	    public void testRenewalDate() {
	        // Create an instance of ContractEmployeeImpl
	        ContractEmployeeImpl employee = new ContractEmployeeImpl(85000);

	        // Calculate the expected renewal date (1 year from today)
	        Calendar calendar = Calendar.getInstance();
	        calendar.add(Calendar.YEAR, 1);
	        Date expectedRenewalDate = calendar.getTime();

	        // Use JUnit's assertTimeoutPreemptively with a tolerance of 1000 milliseconds (1 second)
	        assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
	            Date actualRenewalDate = employee.renewalDate();
	            long timeDifference = Math.abs(expectedRenewalDate.getTime() - actualRenewalDate.getTime());
	            assertTrue(timeDifference <= 1000, "Renewal dates differ by more than 1 second");
	        });
	    }
	}
	
	

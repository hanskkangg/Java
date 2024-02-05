package Assignment01;
import java.util.Scanner;
//I'm importing Calendar to get the current year
import java.util.Calendar;


/**
 * MyHealthDataTest is a main class for gathering and displaying patient's health data. 
 * This program displays patient's information and calculate patient's age, BMI, maximum hear rate and target heart rate.
 * 
 * File Name: MyHealthDataTest.java
 * Student Name: Hans Kang, 040694631
 * Professor: Leanne Seaward
 * Due Date: Oct 15, 2023
 * Modified: Oct 11, 2023
 * Description: This program displays patient's information and calculate patient's age, BMI, maximum hear rate and target heart rate.
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see MyHealthData.java, MyHealthDataBase.java
 */

public class MyHealthDataTest {
	
	 public static void main(String[] args) {
		 
	        Scanner keyboard = new Scanner(System.in);

	        // Displaying Patient's Information
	        System.out.println("Enter patient's information.");
	        
	        System.out.print("First Name: ");
	        String firstName = keyboard.nextLine();
	        
	        System.out.print("Last Name: ");
	        String lastName = keyboard.nextLine();
	        
	        System.out.print("Gender: ");
	        String gender = keyboard.nextLine();
	        
	        System.out.print("Year of Birth: ");
	        int birthYear = keyboard.nextInt();
	        
	        System.out.print("Height (in cm): ");
	        double height = keyboard.nextDouble();
	        
	        System.out.print("Weight (in kg): ");
	        double weight = keyboard.nextDouble();

	        // I'm initializing Calendar to get the current year
	        Calendar today = Calendar.getInstance();
	        int currentYear = today.get(Calendar.YEAR);
	        
	        // Creating myHealthDataBase as new object
	        MyHealthDataBase healthData = new MyHealthDataBase(firstName, lastName, gender, birthYear, currentYear, height, weight);


	        // Displaying the patient's health data
	        healthData.displayMyHealthData();

	        // Displaying calculated patient's information in printF form
	        System.out.printf("Age in years: %d%n", healthData.calculateAge());
	        System.out.printf("BMI: %.2f%n", healthData.calculateBMI(weight, height / 100.0));
	        System.out.printf("Maximum Heart Rate: %d%n", healthData.calculateMaxHeartRate());
	        System.out.printf("Target Heart Rate Range: %d - %d%n", healthData.calculateMinTargetHeartRate(),healthData.calculateMaxTargetHeartRate());
	        // Displaying BMI information
	        System.out.println("BMI VALUES");
	        System.out.println("Underweight: less than 18.5");
	        System.out.println("Normal:      between 18.5 and 24.9");
	        System.out.println("Overweight:  between 25 and 29.9");
	        System.out.println("Obese:       30 or greater");
	    }
}

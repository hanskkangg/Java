package Assignment01;

/**
 * MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
 * also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
 * 
 * File Name: MyHealthDataBase.java
 * Student Name: Hans Kang, 040694631
 * Professor: Leanne, Seaward
 * Due Date: Oct 15, 2023
 * Modified: Oct 11, 2023
 * Description: This class manages and calculate patient's health data such as age, minimum target heart rate, maximum target heart rate and BMI
 * 
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see MyHealthData.java, MyHealthDataTest.
 */


public class MyHealthDataBase extends MyHealthData {
	
	 /**
     * Constructor to initialize attributes by calling the superclass constructor.
     *
     * @param firstName   The patient's first name.
     * @param lastName    The patient's last name.
     * @param gender      The patient's gender.
     * @param birthYear   The patient's year of birth.
     * @param currentYear The current year.
     * @param height      The patient's height in centimeters.
     * @param weight      The patient's weight in kilograms.
     */
    public MyHealthDataBase (String firstName, String lastName, String gender, int birthYear, int currentYear, double height, double weight) 
    {
	super (firstName, lastName, gender, birthYear, currentYear, height, weight);
	}
    
    
    /**
     * This method calculates and returns the patient's age.
     *
     * @return The patient's age in years.
     */
    public int calculateAge() {
        return getCurrentYear() - getBirthYear();
    }
    
    /**
     * This method calculates and returns the patient's maximum heart rate.
     *
     * @return The maximum heart rate.
     */
    public int calculateMaxHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }
    
    /**
     * This method calculates and returns the minimum target heart rate.
     *
     * @return The minimum target heart rate.
     */
    public int calculateMinTargetHeartRate() {
        int maxHeartRate = calculateMaxHeartRate();
        return (int) (maxHeartRate * 0.5);
    }
    
    /**
     * This method calculates and returns the maximum target heart rate.
     *
     * @return The maximum target heart rate.
     */
    public int calculateMaxTargetHeartRate() {
        int maxHeartRate = calculateMaxHeartRate();
        return (int) (maxHeartRate * 0.85);
    }
    
	/** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    
    /**
     * This method is to calculates incorrect BMI.
     *
     * @param weightParam Weight of the patient in pounds.
     * @param heightParam Height of the patient in inches.
     * @return An intentionally incorrect BMI value.
     */
    public double incorrectBMI(double weightParam, double heightParam) {
        return weightParam * 0.7 / (heightParam * heightParam); 
        // I'm changing value of weightParam by 0.7 instead of 703.
    }
    
    
}
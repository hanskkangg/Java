package Assignment01;

/**File Name: MyHealthData.java
 * Student Name: Hans Kang, 040694631
 * Professor: Leanne, Seaward
 * Due Date: Oct 15, 2023
 * Modified: Oct 11, 2023
 * Description: This class has health information about a patient.
 *
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see MyHealthDataBase.java, MyHealthDataTest.java
 */

public class MyHealthData 
{

    //22F CST8284
    //Assignment 1: MyHealthData.java

    //This system maintains important health information about a patient.
    //Note: This class assumes values passed to the set methods are correct.
    // REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
    //Remove unneeded comments when you are done.  Clean code is better code.


    //TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

	//Declaration of attributes according to the UML diagram
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;
	

    // TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
	
	 /**
     * This is a constructor that receives data as PARAMETERS.
     * @param firstName   The patient's first name.
     * @param lastName    The patient's last name.
     * @param gender      The patient's gender.
     * @param birthYear   The patient's year of birth.
     * @param currentYear The current year.
     * @param height      The patient's height in centimeters.
     * @param weight      The patient's weight in kilograms.
     */
	public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear, double height, double weight) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.birthYear = birthYear;
	this.currentYear = currentYear;
	this.height = height;
	this.weight = weight;
	}



    //TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE.
	//getter and setter for each attributes

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//getter and setter for lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//getter and setter for gender
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	//getter and setter for birthYear
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	//getter and setter for currentYear
	public int getCurrentYear() {
		return currentYear;
	}
	//NOTE: There's no set method for currentYear as per instructed

	//getter and setter for height
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	//getter and setter for weight
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}


    // TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
    // TO DO 5: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.

    // START CODE
	
    /**
     * This method displays all the patient's health data.
     */
    public void displayMyHealthData() { 
        System.out.println("Display of patient's Health data");
        System.out.printf("Patient's First Name is: %s%n", firstName);
        System.out.printf("Patient's Last Name is: %s%n", lastName);
        System.out.printf("Patient's Gender is: %s%n", gender);
        System.out.printf("Patient's Birth Year is: %d%n", birthYear);
        System.out.printf("Current Year is: %d%n", currentYear);
        System.out.printf("Patient's Height is: %.2f cm%n", height);
        System.out.printf("Patient's Weight is: %.2f kg%n", weight);   
    //END CODE
        
    //You do not need to modify this piece of code, it is fine as it is.
       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    }
}
 // end class MyHealthData
package Assignment02;

import java.util.Scanner;
public class MetalRodTester {
	
		public static void main(String [] args) {
			
			//declaration and initializing of variable
			Scanner keyboard = new Scanner(System.in);
			MetalRod Rod = new MetalRod();
			String myName = "Program by Hans Kang";
			
			int messageCount = 0; // Count track total number of times the message has been displayed
			int rodsWithinToleranceCount= 0; // count track the number only when the length rods within tolerance
			
			
			System.out.println("Please enter the lenght of the rod in cm");
			
			while (true) {
				
				if (keyboard.hasNextDouble()) { // has nextDouble method
					
					double length = keyboard.nextDouble(); //assigning  input of keyboard.nextdouble to double length
					Rod.setLenght(length); // we're setting the length we got from the input to Rod.setLenght
					Rod.checkTolerance(); // we're checking if the setLenght is within MAXIMUM and MINIMUM range
					messageCount++; //  it counts total number of times the message has been displayed
					
					if (Rod.isWithinTolerance()) { // if input of nextDouble is within tolerance below codes will function
					rodsWithinToleranceCount++; // it counts the number only when the length rods within tolerance
					}
						int percentageWithinTolerance = (int) ((double) rodsWithinToleranceCount / messageCount *100); // we're calculating the percentage of the rods's within tolernace
						
						System.out.printf("%d%% of rods entered so far have been within tolerance. %n", percentageWithinTolerance); // this allows to display the message in percantage
						
						System.out.println("Do you wish to continue? (y/n)"); // asking if we're contiunng the loop or to stop the loop
						String response = keyboard.next(); // user input store into the String response
						
						if (response.charAt(0) == 'y') { // if user input's 'y' it will continue the loop if the index of 
						System.out.println("Please enter the lenght of the rod in cm");
						continue;
						}
						
						else if (response.charAt(0) == 'n') { // if the user input's 'n' it will break the loop
						System.out.println("Goodbye.");
						System.out.println(myName);
						break;
						}
						
		} else { // if keyboard.hasNextDouble doesn't contain double value it will print codes below
						System.out.println("Please enter a numberical value");
						keyboard.next();}
		
		
			}

		}
	}

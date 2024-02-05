package Assignment02;

public class MetalRod {

	
	//declaration 
	private static final double TARGET_LENGHT = 5.55;
	private static final double EPSILON = 0.002;
	private double lenght;
	
	
	//default constructor
	public MetalRod() {
		lenght = 0;
	}
	//overloading constructor
	public MetalRod(double lenght) {
		this.lenght = lenght;
	}
	
	//Getter for length
	public double getLenght() {
		return lenght;
	}
	
	//setter for length
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	//check if the tolerance is within the range
	public void checkTolerance() {
		if (TARGET_LENGHT - EPSILON <= lenght && TARGET_LENGHT + EPSILON >= lenght) {
			System.out.println("This rod is within tolerance");
		} else {
			System.out.println("this rod is not within tolerance");
		}
		
	}
	//Boolean operand to check if lenght is within tolernace false or true
	public boolean isWithinTolerance() {
			return TARGET_LENGHT - EPSILON <= lenght && TARGET_LENGHT + EPSILON >= lenght;
	}
	
}




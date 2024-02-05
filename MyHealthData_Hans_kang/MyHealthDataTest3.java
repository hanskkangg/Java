/*The error of MyHealthDataBase  involved changing the value of the BMI calculation.
Instead of using BMI = 80.0 * 703 / ((185.0 / 100) * (185.0 / 100)), 
I  replaced 703 with 0.7, leading to a mathematical error.
*/

package Assignment01;

import static org.junit.Assert.assertEquals;

/** File Name: MyHealthDataTest3.java
 * Student Name: Hans Kang, 040694631
 * Professor: Leanne, Seaward
 * Due Date: Oct 15, 2023
 * Modified: Oct 11, 2023
 * Description: JUnit tests for the MyHealthData class, including testing the calculateBMI() method.
 *
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see MyHealthData
 */
import org.junit.Before;
import org.junit.Test;

public class MyHealthDataTest3 {

    private MyHealthData myHealthData;

    @Before
    public void setUp() {
        // I'm Creating a MyHealthData object with random data
        myHealthData = new MyHealthData("Hans", "Kang", "Male", 1991, 2023, 185, 80);
    }
    
    //I added calculateBMI method to be able to use it in this class
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    @Test
    public void testCalculateBMI() {
        //  This is the actual value calculated using the input data: birthday 1991, gender male, height 185 cm, and weight 80 kg
        double expectedBMI = 16432.43243243243;;

        // This is to call the calculateBMI() method
        double actualBMI = calculateBMI(myHealthData.getWeight(), myHealthData.getHeight() / 100.0);
        
        // Use the assertEquals method to check if the values are equal
        assertEquals(expectedBMI, actualBMI, 0.00001); 
    }
}

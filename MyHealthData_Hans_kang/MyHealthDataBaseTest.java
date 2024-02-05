package Assignment01;

import static org.junit.Assert.assertEquals;

/** File Name: MyHealthDataTest4.java
 * Student Name: Hans Kang, 040694631
 * Professor: Leanne, Seaward
 * Due Date: Oct 15, 2023
 * Modified: Oct 11, 2023
 * Description: JUnit tests for the MyHealthData class, including testing the incorrectBMI() method.
 *
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see MyHealthData, MyHealthDataBase
 */
import org.junit.Before;
import org.junit.Test;

public class MyHealthDataBaseTest {

    private MyHealthDataBase myHealthDataBase;

    @Before
    public void setUp() {
        // I'm Creating a MyHealthDataBase object with random data
        myHealthDataBase = new MyHealthDataBase("Hans", "Kang", "Male", 1991, 2023, 185, 80);
    }

    @Test
    public void testIncorrectBMI() {
        // This is the actual value calculated using the input data: birthday 1991, gender male, height 185 cm, and weight 80 kg
        double expectedBMI = 16432.43243243243;

        // This is the actual BMI. It has to match with expected BMI 
        double actualBMI = myHealthDataBase.incorrectBMI(myHealthDataBase.getWeight(), myHealthDataBase.getHeight() / 100.0);

        // Use the assertEquals method to check if the values are equal
        assertEquals(expectedBMI, actualBMI, 0.00001);
    }
}

package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.BMICalculator;
import model.BMICalculator.InvalidSizeExeption;

/**
 * BMICalculatorTest
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class BMICalculatorTest {

   private BMICalculator bmiCalculator;

   @BeforeEach
   void setUp() throws InvalidSizeExeption {
      bmiCalculator = new BMICalculator(1.8, 85);
   }
   /*
    * version 1.0: public BMICalculatorTest(double sizeInM, double weightInKg) { bmiCalculator = new
    * BMICalculator(sizeInM, weightInKg); }
    */

   @Test
   public void testConstructor() {
      assertThrows(InvalidSizeExeption.class, () -> new BMICalculator(0, 1));
   }
   /*
    * version 1.0: public testConstructor() throws Exception { try { new BMICalculator(0, 1); }
    * catch (InvalidSizeException e) { throw new Exception(); } }
    */

   @Test
   public void testGetBmi() {
      assertTrue(bmiCalculator.getBmi() - 26.234 <= 0.001);
   }
   /*
    * version 1.0: public void testGetBmi() throws Exception { if (bmiCalculator.getBmi() - 26.234 >
    * 0.001) { throw new Exception(); } }
    */

   @Test
   public void testGetBmiCategory() {
      assertEquals("Uebergewicht", bmiCalculator.getBmiCategory());
   }
   /*
    * version 1.0: public void testGetBmiCategory() throws Exception { if
    * (!bmiCalculator.getBmiCategory().equals("Uebergewicht")) { throw new Exception(); } }
    */

}

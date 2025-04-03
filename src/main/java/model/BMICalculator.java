package model;

/**
 * BMI Rechner
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BMICalculator {

   public static class InvalidSizeExeption extends Exception {

      private static final long serialVersionUID = 1L;

   }

   private double sizeInM;

   private double weightInKg;

   public BMICalculator(double sizeInM, double weightInKg) throws InvalidSizeExeption {
      if (sizeInM == 0) {
         throw new InvalidSizeExeption();
      }

      this.sizeInM = sizeInM;
      this.weightInKg = weightInKg;
   }

   public double getBmi() {
      return weightInKg / (sizeInM * sizeInM);
   }

   public String getBmiCategory() {
      return (getBmi() < 18.5 ? "Untergewicht" : getBmi() < 25 ? "Normalgewicht" : "Uebergewicht");
   }

}

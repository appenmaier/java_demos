package model;

/**
 * Taschenlampe
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public final class FlashLight extends Light {

   private double energyLevel;

   public FlashLight() {
      energyLevel = 1.0;
   }

   public double getEnergyLevel() {
      return energyLevel;
   }

   public void recharge() {
      energyLevel = 1.0;
   }

   @Override
   public void switchOn() {
      isOn = true;
      energyLevel -= 0.1;
      if (energyLevel > 0) {
         isShining = true;
      }
   }

   @Override
   public String toString() {
      return "FlashLight [energyLevel=" + energyLevel + ", isOn=" + isOn + ", isShining="
            + isShining + "]";
   }

}
/* version 1.0: public class FlashLight extends Light {...} */

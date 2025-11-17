package model;

import java.util.Objects;

/**
 * Flash Light
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public final class FlashLight extends Light {

   private double energyLevel;

   public FlashLight() {
      energyLevel = 1.0;
   }

   @Override
   public void switchOn() {
      isOn = true;
      energyLevel -= 0.1;
   }

   public void recharge() {
      energyLevel = 1.0;
   }

   @Override
   public boolean isShining() {
      return energyLevel >= 0.1;
   }

   @Override
   public String toString() {
      return "FlashLight [isOn=" + isOn + ", energyLevel=" + energyLevel + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(energyLevel);
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (!super.equals(obj)) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      FlashLight other = (FlashLight) obj;
      return Double.doubleToLongBits(energyLevel) == Double.doubleToLongBits(other.energyLevel);
   }

}

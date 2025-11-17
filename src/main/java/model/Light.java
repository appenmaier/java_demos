package model;

import java.util.Objects;

/**
 * Light
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public abstract class Light {

   protected boolean isOn;

   public final boolean isOn() {
      return isOn;
   }

   public abstract void switchOn();

   public final void switchOff() {
      isOn = false;
   }

   public abstract boolean isShining();

   @Override
   public int hashCode() {
      return Objects.hash(isOn);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Light other = (Light) obj;
      return isOn == other.isOn;
   }

}

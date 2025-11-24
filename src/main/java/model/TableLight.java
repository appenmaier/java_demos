package model;

import java.util.Objects;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 9.0
 *
 */
public final class TableLight extends Light implements WiredDevice {

   private boolean isConnected;
   private LightBulb lightBulb;
   private final PlugType plugType;

   private static int numberOfTableLights;

   public TableLight(PlugType plugType) {
      this.plugType = plugType;
      numberOfTableLights++;
   }

   @Override
   public void plugIn() {
      isConnected = true;
   }

   @Override
   public void pullThePlug() {
      isConnected = false;
   }

   @Override
   public void switchOn() {
      isOn = true;
   }

   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   @Override
   public boolean isShining() {
      if (isConnected && isOn) {
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "TableLight [isOn=" + isOn + ", isConnected=" + isConnected + ", lightBulb="
            + lightBulb.toString() + ", plugType=" + plugType.toString() + "]";
   }

   public PlugType plugType() {
      return plugType;
   }

   public static int getNumberOfTableLights() {
      return numberOfTableLights;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(isConnected, lightBulb, plugType);
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
      TableLight other = (TableLight) obj;
      return isConnected == other.isConnected && Objects.equals(lightBulb, other.lightBulb)
            && plugType == other.plugType;
   }

}

package model;

import java.awt.Color;
import java.util.Objects;

/**
 * Light Bulb
 * 
 * @author Daniel Appenmaier
 * @version 6.0
 *
 */
public class LightBulb {

   private final Color color;

   public LightBulb() {
      this.color = Color.WHITE;
   }

   public LightBulb(Color color) {
      this.color = color;
   }

   public Color color() {
      return color;
   }

   public boolean equals(LightBulb other) {
      Color color1 = color;
      Color color2 = other.color;
      return color1.equals(color2);
   }

   @Override
   public String toString() {
      return "LightBulb [color=" + color.toString() + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(color);
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
      LightBulb other = (LightBulb) obj;
      return Objects.equals(color, other.color);
   }

}

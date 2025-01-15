package model;

import java.awt.Color;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
public class LightBulb {

   private final Color color;
   /* version 3.0: private String color */
   /* version 2.0: private String color */
   /* version 1.0: public String color; */

   public LightBulb() {
      this.color = Color.WHITE;
   }
   /* version 3.0: public LightBulb() { this.color = "weiss"; } */
   /* version 2.0: - */

   public LightBulb(Color color) {
      this.color = color;
   }
   /* version 3.0: public LightBulb(String color) { this.color = color; } */
   /* version 2.0: - */

   // public void setColor(String color) {
   // this.color = color;
   // }
   /* version 2.0: public void setColor(String color) { this.color = color; } */
   /* version 1.0: - */

   public Color color() {
      return color;
   }
   /* version 3.0: public String color() { return color; } */
   /* version 1.0: - */

   public boolean equals(LightBulb lightBulb) {
      boolean isEqual = this.color.equals(lightBulb.color);
      return isEqual;
   }

   @Override
   public String toString() {
      return "LightBulb [color=" + color.toString() + "]";
   }

}

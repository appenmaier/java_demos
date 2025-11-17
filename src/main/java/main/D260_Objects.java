package main;

import model.LightBulb;
import model.TableLight;

/**
 * Objects
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D260_Objects {

   @SuppressWarnings({"null"})
   public static void main(String[] args) {
      int i = 0;
      TableLight tableLight1 = null;

      i = 5;
      LightBulb greenLightBulb = new LightBulb();
      // greenLightBulb.setColor("grün");
      // tableLight1 = new TableLight();
      tableLight1.changeLightBulb(greenLightBulb);

      int x = i;
      TableLight tableLight2 = tableLight1;

      i = 7;
      // tableLight2.plugIn();
      tableLight1.switchOn();

      System.out.println("i: " + i);
      System.out.println("tableLight1: " + tableLight1);
      System.out.println("x: " + x);
      System.out.println("tableLight2: " + tableLight2);
   }

}

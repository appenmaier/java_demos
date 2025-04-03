package main;

import model.LightBulb;

/**
 * Datenkapselung
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D270_DataEncapsulation {

   @SuppressWarnings("unused")
   public static void main(String[] args) {

      LightBulb redLightBulb = new LightBulb();
      /* version 1.0: redLightBulb.setColor("rot"); redLightBulb.color = "rot"; */

      LightBulb blueLightBulb = new LightBulb();
      /* version 1.0: blueLightBulb.setColor("blau"); blueLightBulb.color = "blau"; */

      /*
       * version 1.0: TableLamp tableLamp1 = new TableLamp(); tableLamp1.isConnected = false;
       * tableLamp1.isShining = true; tableLamp1.plugIn(); tableLamp1.switchOn();
       * tableLamp1.changeLightBulb(redLightBulb); System.out.println(tableLamp1.toString());
       */

   }

}

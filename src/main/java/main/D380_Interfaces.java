package main;

import java.util.ArrayList;

import model.LightBulb;
import model.PlugType;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Interfaces
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D380_Interfaces {

   public static void main(String[] args) {
      ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

      // Wired wiredDevice = new WiredDevice();

      WiredDevice wiredDevice = new Toaster(); // expliziter Upcast
      wiredDevices.add(wiredDevice);
      wiredDevices.add(new TableLight(PlugType.TYPE_F)); // impliziter Upcast

      for (WiredDevice w : wiredDevices) {
         // w.plugIn(); // (Dynamische) Polymorphie
         if (w instanceof TableLight t) { // Downcast
            t.changeLightBulb(new LightBulb());
            t.switchOn();
         }
         System.out.println(w); // (Dynamische) Polymorphie
      }
   }

}

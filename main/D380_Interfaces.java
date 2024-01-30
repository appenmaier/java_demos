package main;

import java.util.ArrayList;
import model.LightBulb;
import model.PlugType;
import model.TableLamp;
import model.Toaster;
import model.WiredDevice;

/**
 * Schnittstellen (Interfaces)
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D380_Interfaces {

  public static void main(String[] args) {

    ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

    // wiredDevices.add(new WiredDevice());
    wiredDevices.add(new Toaster()); // Upcast
    wiredDevices.add(new TableLamp(PlugType.TYPE_F)); // Upcast

    for (WiredDevice wiredDevice : wiredDevices) {
      /* version 1.0: wiredDevice.plugIn(); // (Dynamische) Polymorphie */
      if (wiredDevice instanceof TableLamp) {
        TableLamp t = (TableLamp) wiredDevice; // Downcast
        t.changeLightBulb(new LightBulb());
        t.switchOn();
      }
      System.out.println(wiredDevice); // (Dynamische) Polymorphie
    }

  }

}

package main;

import java.awt.Color;
import java.util.ArrayList;
import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.PlugType;
import model.TableLamp;

/**
 * Vererbung und Polymorphie
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D350_InheritanceAndPolymorphy {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    /* Objekterzeugungen */
    LightBulb redLightBulb = new LightBulb(Color.RED);
    TableLamp tableLamp1 = new TableLamp(PlugType.TYPE_F);
    tableLamp1.changeLightBulb(redLightBulb);

    LightBulb whiteLightBulb = new LightBulb();
    TableLamp tableLamp2 = new TableLamp(PlugType.TYPE_B);
    tableLamp2.changeLightBulb(whiteLightBulb);

    FlashLight flashLight1 = new FlashLight();
    FlashLight flashLight2 = new FlashLight();

    /* Ansatz ohne Vererbung */
    ArrayList<TableLamp> tableLamps = new ArrayList<>();
    tableLamps.add(tableLamp1);
    tableLamps.add(tableLamp2);

    for (int i = 0; i < tableLamps.size(); i++) {
      TableLamp tableLamp = tableLamps.get(i);
      tableLamp.switchOn();
      System.out.println(tableLamp.toString());
    }

    ArrayList<FlashLight> flashLights = new ArrayList<>();
    flashLights.add(flashLight1);
    flashLights.add(flashLight2);

    for (int i = 0; i < flashLights.size(); i++) {
      FlashLight flashLight = flashLights.get(i);
      flashLight.switchOn();
      System.out.println(flashLight.isOn() + " - " + flashLight.getEnergyLevel());
    }

    /* Ansatz mit Vererbung */
    ArrayList<Light> lights = new ArrayList<>();
    lights.add(tableLamp1); // Upcast
    lights.add(tableLamp2); // Upcast
    lights.add(flashLight1); // Upcast
    lights.add(flashLight2); // Upcast

    for (int i = 0; i < lights.size(); i++) {
      Light light = lights.get(i);
      light.switchOn(); // Polymorphie
      // bis Java 16
      if (light instanceof TableLamp) {
        TableLamp tableLamp = (TableLamp) light; // Downcast
        /* version 1.0: tableLamp.plugIn(); */
      }
      // seit Java 16
      if (light instanceof TableLamp tableLamp) { // Downcast
        /* version 1.0: tableLamp.plugIn(); */
      }
      System.out.println(light); // Polymorphie
      light.switchOff(); // Polymorphie
    }

  }

}

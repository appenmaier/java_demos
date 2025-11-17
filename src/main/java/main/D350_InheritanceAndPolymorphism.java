package main;

import java.awt.Color;
import java.util.ArrayList;

import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.PlugType;
import model.TableLight;

/**
 * Inheritance and Polymorphism
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D350_InheritanceAndPolymorphism {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* Objekterzeugungen */
      LightBulb redLightBulb = new LightBulb(Color.RED);
      TableLight tableLight1 = new TableLight(PlugType.TYPE_F);
      tableLight1.changeLightBulb(redLightBulb);

      LightBulb whiteLightBulb = new LightBulb();
      TableLight tableLight2 = new TableLight(PlugType.TYPE_B);
      tableLight2.changeLightBulb(whiteLightBulb);

      FlashLight flashLight1 = new FlashLight();
      FlashLight flashLight2 = new FlashLight();

      /* Ansatz ohne Vererbung */
      ArrayList<TableLight> tableLights = new ArrayList<>();
      tableLights.add(tableLight1);
      tableLights.add(tableLight2);

      for (TableLight t : tableLights) {
         t.switchOn();
         // t.plugIn();
         System.out.println(t);
      }

      ArrayList<FlashLight> flashLights = new ArrayList<>();
      flashLights.add(flashLight1);
      flashLights.add(flashLight2);

      for (FlashLight f : flashLights) {
         f.switchOn();
         f.recharge();
         System.out.println(f);
      }

      /* Ansatz mit Vererbung */
      ArrayList<Light> lights = new ArrayList<>();
      Light light;
      light = tableLight1; // expliziter Upcast
      lights.add(light);
      light = tableLight2; // expliziter Upcast
      lights.add(light);
      lights.add(flashLight1); // impliziter Upcast
      lights.add(flashLight2); // impliziter Upcast

      for (Light l : lights) {
         l.switchOn(); // Polymorphie
         // bis Java 16
         if (light instanceof TableLight) {
            TableLight t = (TableLight) l; // Downcast
            // t.plugIn();
         }
         // seit Java 16
         if (l instanceof FlashLight f) { // Downcast
            f.recharge();
         }
         System.out.println(l); // Polymorphie
      }
   }

}

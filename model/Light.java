package model;

/**
 * Lampe
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public abstract class Light {

   protected boolean isOn;
   protected boolean isShining;

   public final boolean isOn() {
      return isOn;
   }
   /* version 1.0: public boolean isOn() { return isOn; } */

   public final boolean isShining() {
      return isShining;
   }
   /* version 1.0: public boolean isShining() { return isShining; } */

   public final void switchOff() {
      isOn = false;
      isShining = false;
   }
   /* version 1.0: public void switchOff() { isOn = false; isShining = false; } */

   public abstract void switchOn();
   /* version 1.0: public void switchOn() { isOn = true; isShining = true; } */

}
/* version 1.0: public class Light {...} */

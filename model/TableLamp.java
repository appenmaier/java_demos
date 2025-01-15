package model;

/**
 * Tischleuchte
 *
 * @author Daniel Appenmaier
 * @version 8.0
 *
 */
public final class TableLamp extends Light implements WiredDevice {

   /* version 3.0: - */
   private static int numberOfTableLamps;
   /* version 3.0: - */
   private final static String TYPE = "Tischleuchte";

   public static int getNumberOfTableLamps() {
      return numberOfTableLamps;
   }
   /* version 3.0: - */

   private boolean isConnected;
   /* version 1.0: public boolean isConnected */
   private LightBulb lightBulb;
   /* version 1.0: public LightBulb lightBulb */
   private final PlugType plugType;

   public TableLamp(PlugType plugType) {
      this.plugType = plugType;
      numberOfTableLamps++;
   }
   /* version 2.0: - */

   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      if (isConnected && isOn) {
         isShining = true;
      }
      return oldLightBulb;
   }

   @Override
   public void plugIn() throws AlreadyPluggedInException {
      if (isConnected) {
         throw new AlreadyPluggedInException();
      }

      isConnected = true;
      if (isOn && lightBulb != null) {
         isShining = true;
      }
   }
   /*
    * version 7.0: public void plugIn() { isConnected = true; if (isOn && lightBulb != null) {
    * isShining = true; } }
    */

   public PlugType plugType() {
      return plugType;
   }

   @Override
   public void pullThePlug() {
      isConnected = false;
      isShining = false;
   }

   @Override
   public void switchOn() {
      isOn = true;
      if (isConnected && lightBulb != null) {
         isShining = true;
      }
   }

   @Override
   public String toString() {
      return TYPE + " [isConnected=" + isConnected + " isOn=" + isOn + " isShining=" + isShining
            + " lightBulb=" + lightBulb.toString() + " plugType=" + plugType.toString() + "]";
   }

}
/* version 6.0: public final class TableLamp extends Light {...} */
/* version 5.0: public class TableLamp extends Light {...} */
/* version 4.0: public class TableLamp {...} */

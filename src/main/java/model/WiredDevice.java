package model;

/**
 * Wired Device
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public interface WiredDevice {

   void plugIn() throws AlreadyPluggedInException;

   void pullThePlug();

}

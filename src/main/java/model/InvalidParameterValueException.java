package model;

/**
 * InvalidParameterValueException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InvalidParameterValueException extends Exception {

   private static final long serialVersionUID = 1L;

   public InvalidParameterValueException(String parameter, Object value) {
      super("Invalid value " + value + " for parameter " + parameter);
   }

}

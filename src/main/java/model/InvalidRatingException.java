package model;

/**
 * InvalidRatingException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@SuppressWarnings("serial")
public class InvalidRatingException extends Exception {

   public InvalidRatingException(int rating) {
      super(rating + " is an invalid rating (has to be between 1 and 5)");
   }

}

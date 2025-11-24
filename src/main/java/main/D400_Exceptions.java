package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.InvalidParameterValueException;
import model.Movie;

/**
 * Exceptions
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D400_Exceptions {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* ArrayIndexOutOfBoundsException und NullPointerException */
      try {
         String[] names = {"Hans", "Peter", null};
         System.out.println(names[3]);
         String name = names[2];
         System.out.println(name.toUpperCase());
      } catch (ArrayIndexOutOfBoundsException e) {
         e.printStackTrace();
      } catch (NullPointerException e) {
         e.printStackTrace();
      }

      /* InputMismatchException */
      try {
         Scanner sc = new Scanner(System.in);
         System.out.print("Eine ganze Zahl eingeben: ");
         int number = sc.nextInt();
         System.out.println(number);
      } catch (InputMismatchException e) {
         e.printStackTrace();
      }

      /* ClassCastException */
      try {
         Number n;
         Integer i = 42;
         n = i;
         Double d = (Double) n;
         System.out.println(d);
      } catch (ClassCastException e) {
         e.printStackTrace();
      }

      /* InvalidParameterValueException */
      try {
         Movie movie = new Movie(null, null, null, 0);
         System.out.println(movie);
      } catch (InvalidParameterValueException e) {
         e.printStackTrace();
      }
      try {
         Movie movie = new Movie(null, null, null, 1);
         movie.setRating(0);
         System.out.println(movie);
      } catch (InvalidParameterValueException e) {
         e.printStackTrace();
      }
      try {
         Movie movie = new Movie(null, null, null, 1);
         movie.setRating(1);
         movie.setVotes(-1);
         System.out.println(movie);
      } catch (InvalidParameterValueException e) {
         e.printStackTrace();
      }
   }

}

package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.AlreadyPluggedInException;
import model.FlashLight;
import model.Light;
import model.PlugType;
import model.TableLight;

/**
 * Ausnahmen (Exceptions)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D400_Exceptions {

   @SuppressWarnings("resource")
   public static void main(String[] args) {

      /* ArrayIndexOutOfBoundsException und NullPointerException */
      String[] names = {"Hans", "Peter", null};
      try {
         System.out.println(names[3]);
         String name = names[2];
         System.out.println(name.toUpperCase());
      } catch (ArrayIndexOutOfBoundsException e) {
         System.err.println(e.getMessage());
      } catch (NullPointerException e) {
         e.printStackTrace();
      }

      /* InputMismatchException */
      try {
         Scanner sc = new Scanner(System.in);
         System.out.print("Bitte gib eine ganze Zahl ein: ");
         int number = sc.nextInt();
         System.out.println(number);
      } catch (InputMismatchException e) {
         System.out.println("Eine InputMismatchException ist aufgetreten");
      }

      /* ClassCastException */
      Light light;
      light = new TableLight(PlugType.TYPE_F);
      if (light instanceof FlashLight) {
         FlashLight flashLight = (FlashLight) light;
         flashLight.recharge();
      }

      /* AlreadyPluggedInException */
      TableLight tableLamp = new TableLight(PlugType.TYPE_F);
      try {
         tableLamp.plugIn();
         tableLamp.plugIn();
         tableLamp.plugIn();
      } catch (AlreadyPluggedInException e) {
         System.err.println(e.getMessage());
      }

      System.out.println("Programmende");

   }

}

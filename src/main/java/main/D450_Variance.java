package main;

import java.util.ArrayList;

/**
 * Varianz
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D450_Variance {

   @SuppressWarnings("unused")
   public static void main(String[] args) {

      ArrayList<?> bivariantList;
      bivariantList = new ArrayList<Object>();
      bivariantList = new ArrayList<Number>();
      bivariantList = new ArrayList<Integer>();
      bivariantList = new ArrayList<String>();

      ArrayList<? extends Number> covariantList;
      // covariantList = new ArrayList<Object>();
      covariantList = new ArrayList<Number>();
      covariantList = new ArrayList<Integer>();
      // covariantList = new ArrayList<String>();

      ArrayList<? super Number> contravariantList;
      contravariantList = new ArrayList<Object>();
      contravariantList = new ArrayList<Number>();
      // contravariantList = new ArrayList<Integer>();
      // contravariantList = new ArrayList<String>();

      ArrayList<Number> invariantList;
      // invariantList = new ArrayList<Object>();
      invariantList = new ArrayList<Number>();
      // invariantList = new ArrayList<Integer>();
      // invariantList = new ArrayList<String>();

   }

}

package main;

import model.Order;
import model.Order.Item;
import model.Order.Orderer;

/**
 * Nested Classes and Member Classes
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D420_NestedClassesAndMemberClasses {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* Top Level Class */
      Order order = new Order();

      /* Nested Class */
      Orderer orderer = new Orderer("Hans");

      /* Member Class */
      // Item item = new Item("Bestellposition 1");
      Item item = order.new Item("Bestellposition 1");
   }

}

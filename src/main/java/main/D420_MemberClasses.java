package main;

import model.Order;
import model.Order.OrderItem;

/**
 * Elementklassen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D420_MemberClasses {

   public static void main(String[] args) {

      Order order = new Order();
      OrderItem orderItem = order.new OrderItem();
      orderItem.description = "Bestellposition 1";
      order.orderItems.add(orderItem);

   }

}

package model;

import java.util.ArrayList;

/**
 * Bestellung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Order {

  /**
   * Bestell-Position
   *
   * @author Daniel Appenmaier
   * @version 1.0
   *
   */
  public class OrderItem {

    public String description;

  }

  public ArrayList<OrderItem> orderItems;

}

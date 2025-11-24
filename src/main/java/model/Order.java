package model;

import java.util.List;

import lombok.Data;

/**
 * Order
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
public class Order {

   private List<Item> items;
   private Orderer orderer;

   @Data
   public static class Orderer {

      private final String name;

   }

   @Data
   public class Item {

      private final String description;

   }

}

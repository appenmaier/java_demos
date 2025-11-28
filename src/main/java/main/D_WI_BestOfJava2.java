package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import model.FastFood;
import model.FastFoodCategory;
import model.InvalidRatingException;
import model.NoProductFoundException;
import model.Shop;

/**
 * Best of Java 2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D_WI_BestOfJava2 {

   public static void main(String[] args) {
      List<FastFood> fastFood = new ArrayList<>();

      FastFood fastFood1 = new FastFood("Hamburger", FastFoodCategory.BURGER, 800, false);
      FastFood fastFood2 = new FastFood("Pommes", FastFoodCategory.FRIES, 600, true);
      FastFood fastFood3 = new FastFood("Veggie Burger", FastFoodCategory.BURGER, 500, true);

      fastFood.add(fastFood3);
      fastFood.add(fastFood1);
      fastFood.add(fastFood2);

      fastFood.forEach(System.out::println);
      Collections.sort(fastFood);
      fastFood.forEach(System.out::println);

      Shop<FastFood> shop = new Shop<>("Burger King", new HashMap<>());

      shop.addProduct(fastFood1);
      shop.addProduct(fastFood2);
      shop.addProduct(fastFood3);
      shop.addProduct(fastFood1);

      try {
         shop.rateProduct(fastFood3, 4);
         shop.rateProduct(fastFood3, 5);
         shop.rateProduct(fastFood3, 3);
         shop.rateProduct(fastFood1, 2);
         // shop.rateProduct(new FastFood("Pizza", FastFoodCategory.PIZZA, 800, true), 5);
         // shop.rateProduct(fastFood2, 6);
         // shop.rateProduct(fastFood2, -1);
      } catch (NoProductFoundException e) {
         e.printStackTrace();
      } catch (InvalidRatingException e) {
         e.printStackTrace();
      }

      System.out.println("Sortiment");
      shop.assortment().forEach((p, rs) -> System.out.println(p + ": " + rs));
      System.out.println();
      System.out.println(shop.getBestRatedProduct());
      System.out.println();
      shop.getAllProductsSortedByNaturalOrdering().forEach(System.out::println);
   }

}

package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * ShopTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ShopTest {

   private Shop<FastFood> shop;
   @Mock
   private FastFood fastFood1;
   @Mock
   private FastFood fastFood2;
   @Mock
   private FastFood fastFood3;

   @BeforeEach
   void setUp() {
      MockitoAnnotations.openMocks(this);

      shop = new Shop<>("Burger King", new HashMap<>());
   }

   @Test
   void testAddProduct() {
      shop.addProduct(fastFood1);
      shop.addProduct(fastFood2);
      shop.addProduct(fastFood3);
      shop.addProduct(fastFood1);

      assertEquals(3, shop.assortment().keySet().size());
      assertTrue(shop.assortment().keySet().size() == 3);
      assertTrue(shop.assortment().containsKey(fastFood1));
      assertTrue(shop.assortment().containsKey(fastFood2));
      assertTrue(shop.assortment().containsKey(fastFood3));
   }

   @Test
   void testRateProduct() {
      shop.addProduct(fastFood1);
      shop.addProduct(fastFood2);

      assertThrows(NoProductFoundException.class, () -> shop.rateProduct(fastFood3, 5));
      assertThrows(InvalidRatingException.class, () -> shop.rateProduct(fastFood2, 0));
      assertThrows(InvalidRatingException.class, () -> shop.rateProduct(fastFood2, 6));
   }

   @Test
   void testFetAllProductsSortedByNaturalOrdering() {
      shop.addProduct(fastFood1);
      shop.addProduct(fastFood2);
      shop.addProduct(fastFood3);

      when(fastFood1.compareTo(fastFood2)).thenReturn(1);
      when(fastFood1.compareTo(fastFood3)).thenReturn(1);
      when(fastFood2.compareTo(fastFood1)).thenReturn(-1);
      when(fastFood2.compareTo(fastFood3)).thenReturn(-1);
      when(fastFood3.compareTo(fastFood1)).thenReturn(-1);
      when(fastFood3.compareTo(fastFood2)).thenReturn(1);

      assertEquals(List.of(fastFood2, fastFood3, fastFood1),
            shop.getAllProductsSortedByNaturalOrdering());
   }

}

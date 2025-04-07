package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * CrateTest
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class CrateTest {

   @Mock
   private Sphere sphere1;
   /* version 1.0: private Sphere sphere1; */
   @Mock
   private Sphere sphere2;
   /* version 1.0: private Sphere sphere2; */
   @Mock
   private Body body;
   /* version 1.0: private Body body; */
   private Crate crate;

   @BeforeEach
   void setUp() {
      MockitoAnnotations.openMocks(this);
      crate = new Crate(new ArrayList<>());
   }
   /*
    * version 1.0: @BeforeEach void setUp() { sphere1 = new Sphere(2.0); sphere2 = new Sphere(1.0);
    * body = () -> 1.5; crate = new Crate(new ArrayList<>()); }
    */

   @Test
   void testAddBody() {
      crate.addBody(sphere1);
      crate.addBody(sphere2);
      crate.addBody(body);
      assertEquals(sphere1, crate.bodies().get(0));
      assertEquals(sphere2, crate.bodies().get(1));
      assertEquals(body, crate.bodies().get(2));
      assertThrows(NullPointerException.class, () -> crate.addBody(null));
   }

   @Test
   void testGetBodyWithHighestVolume() {
      when(sphere1.getVolume()).thenReturn(33.51);
      when(sphere2.getVolume()).thenReturn(4.189);
      when(body.getVolume()).thenReturn(14.137);
      assertEquals(Optional.empty(), crate.getBodyWithHighestVolume());
      crate.bodies().add(sphere1);
      crate.bodies().add(sphere2);
      crate.bodies().add(body);
      assertEquals(Optional.of(sphere1), crate.getBodyWithHighestVolume());
   }
   /*
    * version 1.0: @Test void testGetBodyWithHighestVolume() { assertEquals(Optional.empty(),
    * crate.getBodyWithHighestVolume()); crate.bodies().add(sphere1); crate.bodies().add(sphere2);
    * crate.bodies().add(body); assertEquals(Optional.of(sphere1),
    * crate.getBodyWithHighestVolume()); }
    */

   @Test
   void testGetAllSpheres() {
      crate.bodies().add(sphere1);
      crate.bodies().add(sphere2);
      crate.bodies().add(body);
      assertEquals(2, crate.getAllSpheres().size());
   }

}

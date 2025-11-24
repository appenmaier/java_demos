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
   @Mock
   private Sphere sphere2;
   @Mock
   private Body body;
   private Crate crate;

   @BeforeEach
   void setUp() {
      MockitoAnnotations.openMocks(this);
      crate = new Crate(new ArrayList<>());
   }

   @Test
   void addBody_Add3Bodies_ListWith3Bodies() throws DuplicateEntryException {
      crate.addBody(sphere1);
      crate.addBody(sphere2);
      crate.addBody(body);
      assertEquals(sphere1, crate.bodies().get(0));
      assertEquals(sphere2, crate.bodies().get(1));
      assertEquals(body, crate.bodies().get(2));
   }

   @Test
   void addBody_AddOneBodyTwice_DuplicateException() throws DuplicateEntryException {
      crate.addBody(body);
      assertThrows(DuplicateEntryException.class, () -> crate.addBody(body));
   }

   @Test
   void getBodyWithHighestVolume_EmptyList_EmptyOptional() {
      assertEquals(Optional.empty(), crate.getBodyWithHighestVolume());
   }

   @Test
   void getBodyWithHighestVolume_ListWith3Bodies_BodyWithHighestVolume() {
      when(sphere1.getVolume()).thenReturn(3.0);
      when(sphere2.getVolume()).thenReturn(1.0);
      when(body.getVolume()).thenReturn(2.0);
      crate.bodies().add(sphere1);
      crate.bodies().add(sphere2);
      crate.bodies().add(body);
      assertEquals(Optional.of(sphere1), crate.getBodyWithHighestVolume());
   }

   @Test
   void getAllSpheres_AddNothing_EmptyList() {
      assertEquals(0, crate.getAllSpheres().size());
   }

   @Test
   void getAllSpheres_Add1Body_EmptyList() {
      assertEquals(0, crate.getAllSpheres().size());
   }

   @Test
   void getAllSpheres_Add2SpheresAnd1Body_ListWith2Spheres() {
      crate.bodies().add(sphere1);
      crate.bodies().add(sphere2);
      crate.bodies().add(body);
      assertEquals(2, crate.getAllSpheres().size());
   }

}

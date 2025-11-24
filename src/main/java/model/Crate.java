package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Crate
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Crate(List<Body> bodies) {

   public void addBody(Body body) throws DuplicateEntryException {
      if (bodies.contains(body)) {
         throw new DuplicateEntryException();
      }
      bodies.add(body);
   }

   public Optional<Body> getBodyWithHighestVolume() {
      Body bodyWithHighestVolume = null;
      double highestVolume = 0;
      for (Body b : bodies) {
         if (b.getVolume() > highestVolume) {
            highestVolume = b.getVolume();
            bodyWithHighestVolume = b;
         }
      }
      return Optional.ofNullable(bodyWithHighestVolume);
   }

   public List<Sphere> getAllSpheres() {
      List<Sphere> spheres = new ArrayList<>();
      for (Body b : bodies) {
         if (b instanceof Sphere s) {
            spheres.add(s);
         }
      }
      return spheres;
   }

}

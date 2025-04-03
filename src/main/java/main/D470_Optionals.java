package main;

import java.util.Optional;

/**
 * Optionals
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D470_Optionals {

   private static Optional<String> getOptionalText(boolean giveBack) {
      if (giveBack) {
         return Optional.of("Hallo Welt");
      }
      return Optional.empty();
   }

   private static String getText(boolean giveBack) {
      if (giveBack) {
         return "Hallo Welt";
      }
      return null;
   }

   public static void main(String[] args) {

      /* Ohne Optionals */
      String text = getText(false);
      try {
         System.out.println(text.toUpperCase());
      } catch (NullPointerException e) {

      }

      if (text != null) {
         System.out.println(text.toUpperCase());
      }

      /* Mit Optionals */
      Optional<String> optionalText = getOptionalText(false);
      if (optionalText.isPresent()) {
         System.out.println(optionalText.get().toUpperCase());
      }

      optionalText.ifPresent(s -> System.out.println(s.toUpperCase()));
      System.out.println(optionalText.orElse("Alternativer Text"));

   }

}

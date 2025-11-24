package main;

import java.util.Optional;
import java.util.Random;

/**
 * Optionals
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D470_Optionals {

   private static boolean giveBack;

   public static void main(String[] args) {
      Random random = new Random();
      giveBack = random.nextBoolean();

      /* Ohne Optionals */
      String text = getText();
      if (text != null) {
         System.out.println(text.toUpperCase());
      } else {
         System.out.println("Kein Text");
      }

      /* Mit Optionals (imperative Lösung) */
      Optional<String> optionalText1 = getOptionalText();
      if (optionalText1.isPresent()) {
         System.out.println(optionalText1.get().toUpperCase());
      } else {
         System.out.println("Kein Text");
      }

      /* Mit Optionals (deklarative Lösung) */
      Optional<String> optionalText2 = getOptionalText();
      optionalText2.ifPresentOrElse(t -> System.out.println(t.toUpperCase()),
            () -> System.out.println("Kein Text"));
   }

   private static String getText() {
      if (giveBack) {
         return "Text";
      } else {
         return null;
      }
   }

   private static Optional<String> getOptionalText() {
      if (giveBack) {
         return Optional.of("Text");
      } else {
         return Optional.empty();
      }
   }

}

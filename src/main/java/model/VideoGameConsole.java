package model;

/**
 * Video Game Console
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum VideoGameConsole {

   PS4("Playstation 4"), NSW("Nintendo Switch");

   private final String description;

   VideoGameConsole(String description) {
      this.description = description;
   }

   public String description() {
      return description;
   }

}

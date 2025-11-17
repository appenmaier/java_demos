package main;

/**
 * Strings
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D070_Strings {

   public static void main(String[] args) {
      /* Wichtige Methoden */
      String text = "Hello World";

      int length = text.length();
      char characterAtIndex7 = text.charAt(7);
      char firstCharacter = text.charAt(0);
      char lastCharacter = text.charAt(length - 1);

      System.out.println("length: " + length);
      System.out.println("characterAtIndex7: " + characterAtIndex7);
      System.out.println("firstCharacter: " + firstCharacter);
      System.out.println("lastCharacter: " + lastCharacter);

      /* Zeichenketten-Konkatenation */
      String columns = "id";
      String table = "flight";
      String condition = "city = 'Ravensburg'";
      String sqlQuery = "SELECT " + columns + "\nFROM " + table + "\nWHERE " + condition + ";";
      System.out.println(sqlQuery);

      /* Zeichenketten-Templates */
      // String sqlQuery2 = STR."""
      // SELECT \{ columns }
      // FROM \{ table }
      // WHERE \{ condition };
      // """;

      /* Escape-Sequenzen */
      System.out.println("Hallo \"Peter\""); // Anführungszeichen
      System.out.println("C:\\Temp"); // Schrägstrich Links
   }

}

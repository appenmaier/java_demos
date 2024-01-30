package main;

import java.util.Scanner;

/**
 * Mehrfachverzweigungen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D150_SwitchCases {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Gibt bitte \"R/r\", \"G/g\" oder \"B/b\": ");
    char color = sc.next().charAt(0);

    String colorText;

    if (color == 'R' || color == 'r') {
      colorText = "rot";
    } else if (color == 'G' || color == 'g') {
      colorText = "gruen";
    } else if (color == 'B' || color == 'b') {
      colorText = "blau";
    } else {
      colorText = "";
    }

    System.out.println(colorText);

    switch (color) {
      case 'R':
      case 'r':
        colorText = "rot";
        break;
      case 'G':
      case 'g':
        colorText = "gruen";
        break;
      case 'B':
      case 'b':
        colorText = "blau";
        break;
      default:
        colorText = "";
        break;
    }

    System.out.println(colorText);

    colorText = switch (color) {
      case 'R', 'r' -> "rot";
      case 'G', 'g' -> "gruen";
      case 'B', 'b' -> "blau";
      default -> "";
    };

    System.out.println(colorText);

  }

}

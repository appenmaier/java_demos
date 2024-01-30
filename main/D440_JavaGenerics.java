package main;

import model.Box;

/**
 * Generische Programmierung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D440_JavaGenerics {

  public static void main(String[] args) {

    Box<String> stringBox = new Box<>();
    stringBox.setContent("Hello World");
    String text = stringBox.getContent();
    System.out.println(text);

    Box<Integer> integerBox = new Box<>();
    integerBox.setContent(42);
    int number = integerBox.getContent();
    System.out.println(number);

  }

}

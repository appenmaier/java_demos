package model;

/**
 * Kiste
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class Box<T> {

   private T content;

   public Box() {
   }

   public T getContent() {
      return content;
   }

   public void setContent(T content) {
      this.content = content;
   }

}

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
  /* version 1.0: private Object content; */

  public Box() {

  }

  public T getContent() {
    return content;
  }
  /* version 1.0: public Object getContent() { return content; } */

  public void setContent(T content) {
    this.content = content;
  }
  /* version 1.0: public void setContent(Object content) { this.content = content; } */

}
/* 1.0: public class Box {...} */

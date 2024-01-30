package ui.light;

public class MainClass {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    LightView view = new LightView();
    LightPresenter presenter = new LightPresenter(view);
    view.setVisible(true);

  }

}

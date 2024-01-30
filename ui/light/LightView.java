package ui.light;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LightView extends JFrame {

  public JPanel buttons;
  public LightCanvas canvas;
  public JButton plugIn;
  public JButton pullThePlug;
  public JButton switchColor;
  public JButton switchOff;
  public JButton switchOn;

  public LightView() {
    /* Set View Attributes */
    setTitle("Licht");
    setSize(750, 500);
    setLocationRelativeTo(null);
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    /* Initialize Components */
    buttons = new JPanel();
    canvas = new LightCanvas();
    switchOn = new JButton("Einschalten");
    switchOff = new JButton("Ausschalten");
    plugIn = new JButton("Einstecken");
    pullThePlug = new JButton("Ausstecken");
    switchColor = new JButton("Farbe wechseln");

    /* Set Layout */
    setLayout(new BorderLayout(25, 25));
    add(buttons, BorderLayout.SOUTH);
    add(canvas, BorderLayout.CENTER);
    buttons.add(plugIn);
    buttons.add(switchOn);
    buttons.add(switchOff);
    buttons.add(pullThePlug);
    buttons.add(switchColor);
  }

  public JPanel getButtons() {
    return buttons;
  }

  public LightCanvas getCanvas() {
    return canvas;
  }

  public JButton getPlugIn() {
    return plugIn;
  }

  public JButton getPullThePlug() {
    return pullThePlug;
  }

  public JButton getSwitchColor() {
    return switchColor;
  }

  public JButton getSwitchOff() {
    return switchOff;
  }

  public JButton getSwitchOn() {
    return switchOn;
  }

}

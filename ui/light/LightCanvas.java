package ui.light;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LightCanvas extends JPanel {

  private Light light;

  public LightCanvas() {
    setBackground(Color.WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Rectangle bounds = g.getClipBounds();
    int radius = 50;
    int x = (int) bounds.getCenterX() - (radius / 2);
    int y = (int) bounds.getCenterY() - (radius / 2);
    if (light.isConnected()) {
      g.drawLine((int) bounds.getCenterX(), (int) bounds.getCenterY() + (radius / 2),
          (int) bounds.getCenterX(), (int) bounds.getMaxY());
    }
    g.setColor(light.getColor());
    g.fillOval(x, y, radius, radius);
    if (light.isShining()) {
      g.setColor(new Color(light.getColor().getRed(), light.getColor().getGreen(),
          light.getColor().getBlue(), light.getColor().getAlpha() / 2));
      g.fillOval(x - radius - radius / 2, y - radius - radius / 2, radius * 4, radius * 4);
    }
  }

  public void setLight(Light light) {
    this.light = light;
  }

}

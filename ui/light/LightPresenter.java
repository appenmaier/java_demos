package ui.light;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LightPresenter {

  public class PlugInActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      light.plugIn();
      view.getCanvas().repaint();
    }
  }
  public class PullThePlugActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      light.pullThePlug();
      view.getCanvas().repaint();
    }
  }

  public class SwitchColorActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      Random random = new Random();
      Color color = switch (random.nextInt(4)) {
        case 0 -> Color.RED;
        case 1 -> Color.GREEN;
        case 2 -> Color.BLUE;
        default -> Color.YELLOW;
      };
      light.setColor(color);
      view.getCanvas().repaint();
    }
  }

  public class SwitchOffActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      light.switchOff();
      view.getCanvas().repaint();
    }
  }

  public class SwitchOnActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      light.switchOn();
      view.getCanvas().repaint();
    }
  }

  private Light light;
  private LightView view;

  public LightPresenter(LightView view) {
    this.view = view;
    Random random = new Random();
    Color color = switch (random.nextInt(4)) {
      case 0 -> Color.RED;
      case 1 -> Color.GREEN;
      case 2 -> Color.BLUE;
      default -> Color.YELLOW;
    };
    light = new Light(color);
    view.getCanvas().setLight(light);
    view.getSwitchOn().addActionListener(new SwitchOnActionListener());
    view.getSwitchOff().addActionListener(new SwitchOffActionListener());
    view.getPlugIn().addActionListener(new PlugInActionListener());
    view.getPullThePlug().addActionListener(new PullThePlugActionListener());
    view.getSwitchColor().addActionListener(new SwitchColorActionListener());
  }

}

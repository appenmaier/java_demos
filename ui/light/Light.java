package ui.light;

import java.awt.Color;

public class Light {

  private Color color;
  private boolean isConnected;
  private boolean isOn;
  private boolean isShining;

  public Light(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public boolean isConnected() {
    return isConnected;
  }

  public boolean isOn() {
    return isOn;
  }

  public boolean isShining() {
    return isShining;
  }

  public void plugIn() {
    if (isOn) {
      isShining = true;
    }
    isConnected = true;
  }

  public void pullThePlug() {
    isConnected = false;
    isShining = false;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void switchOff() {
    isOn = false;
    isShining = false;
  }

  public void switchOn() {
    if (isConnected) {
      isShining = true;
    }
    isOn = true;
  }

}

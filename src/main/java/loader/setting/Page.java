package loader.setting;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "page")
public class Page {
  private int width;
  private int height;

  @XmlElement(name = "width")
  public void setWidth(int width) {
    this.width = width;
  }

  @XmlElement(name = "height")
  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}

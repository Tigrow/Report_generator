package loader;

import loader.setting.Column;
import loader.setting.Page;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "settings")
public class Settings {

  @XmlElement(name = "page")
  private Page page;

  @XmlElementWrapper(name = "columns")
  @XmlElement(name = "column")
  private List<Column> columns = new ArrayList<>();

  public Page getPage() {
    return page;
  }


  public List<Column> getColumns() {
    return columns;
  }

}
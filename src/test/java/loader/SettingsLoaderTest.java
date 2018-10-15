package loader;

import loader.setting.Column;
import loader.setting.Page;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SettingsLoaderTest {

  private Reader reader;
  private Page page;
  private Column column;

  @Before
  public void setUp() throws Exception {
    byte[] data = ("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<settings>\n" +
            "    <page>\n" +
            "        <width>32</width>\n" +
            "        <height>12</height>\n" +
            "    </page>\n" +
            "    <columns>\n" +
            "        <column>\n" +
            "            <title>Номер</title>\n" +
            "            <width>8</width>\n" +
            "        </column>\n" +
            "        <column>\n" +
            "            <title>Дата</title>\n" +
            "            <width>7</width>\n" +
            "        </column>\n" +
            "        <column>\n" +
            "            <title>ФИО</title>\n" +
            "            <width>7</width>\n" +
            "        </column>\n" +
            "    </columns>\n" +
            "</settings>").getBytes();
    reader = new InputStreamReader(new ByteArrayInputStream(data));

    page = new Page();
    page.setHeight(12);
    page.setWidth(32);

    column = new Column();
    column.setTitle("Номер");
    column.setWidth(8);

  }

  @Test
  public void loadSettings() throws JAXBException, XMLStreamException {

    Settings settings = SettingsLoader.loadSettings(reader);

    Assert.assertEquals(settings.getColumns().get(0).getTitle(),column.getTitle());
    Assert.assertEquals(settings.getColumns().get(0).getWidth(),column.getWidth());
    Assert.assertEquals(settings.getPage().getHeight(),page.getHeight());
    Assert.assertEquals(settings.getPage().getWidth(),page.getWidth());
  }
}
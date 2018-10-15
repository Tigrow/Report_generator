package generator;

import loader.setting.field.Column;
import loader.setting.field.Page;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PageGeneratorTest {

  private List<Column> columnList;
  private PageGenerator pageGenerator;

  @Before
  public void setUp() throws Exception {
    Column column = new Column();
    column.setTitle("ФИО");
    column.setWidth(8);
    columnList.add(column);
    Page page = new Page();
    page.setHeight(12);
    page.setWidth(32);
    pageGenerator = new PageGenerator(columnList, page);
  }

  @Test
  public void generateRow() {
  }

  @Test
  public void generateField() {
    List<String> strings = pageGenerator.generateField("Рома Васечкин",8);
    Assert.assertEquals(strings.get(0)," Рома     ");
    Assert.assertEquals(strings.get(1)," Васечкин ");

    strings = pageGenerator.generateField("Рома Караганданович",8);
    Assert.assertEquals(strings.get(0)," Рома     ");
    Assert.assertEquals(strings.get(1)," Караганд ");
    Assert.assertEquals(strings.get(2)," анович   ");
  }
}
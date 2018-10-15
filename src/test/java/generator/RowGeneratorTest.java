package generator;

import loader.setting.field.Column;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RowGeneratorTest {

  List<Column> columnList;
  RowGenerator rowGenerator;

  @Before
  public void setUp() throws Exception {
    Column column = new Column();
    column.setTitle("ФИО");
    column.setWidth(8);
    columnList.add(column);
    rowGenerator = new RowGenerator(columnList, 14);
  }

  @Test
  public void generateRow() {
    String str[] = {"Рома Васечкин"};
    String string = rowGenerator.generateRow(str);
    Assert.assertEquals(string,"| Рома     |" +
                                      "| Васечкин |");
  }
}
package generator;

import loader.setting.field.Column;
import loader.setting.field.Page;

import java.util.ArrayList;
import java.util.List;

public class PageGenerator {
  private static final String ROW_SEPARATOR = "|";
  private static final String WHITE_SPACE = " ";
  private List<Column> columns;
  private Page page;

  public PageGenerator(List<Column> columns, Page page) {
    this.columns = columns;
    this.page = page;
  }

  String[] generateRow(String[] fields) {
    String string;

    return null;
  }

  List<String> generateField(String field, int width) {
    List<String> stringList = new ArrayList<>();
    int line = 0;
    if (field.length() > width) {
      String[] split = field.split("[\\W]");
      for (String str : split) {
        if (str.length() > width) {

        }else 
      }
    } else {
      String string = field;
      for(int i = 0; i<=width-field.length();i++){
        string = string + WHITE_SPACE;
      }
      stringList.add(string);
    }
    stringList.set(line, WHITE_SPACE + stringList.get(line) + WHITE_SPACE);
    return null;
  }
}

package generator;

import loader.setting.field.Column;

import java.util.List;

class RowGenerator {
  private List<Column> columns;
  private int rowWidth;

  RowGenerator(List<Column> columns, int rowWidth) {
    this.columns = columns;
    this.rowWidth = rowWidth;
  }

  String generateRow(String[] field) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("| ");
    for (int i = 0; i < field.length; i++) {
      if (field[i].length() > columns.get(i).getWidth()){

      }
    }
    return null;
  }

  private String[] splitField(String string, int width){
    String str[] = string.split("[\\W]");
    //if (str.length > )
    return null;
  }
}

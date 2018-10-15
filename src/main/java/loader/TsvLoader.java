package loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class TsvLoader implements Loader<List<String[]>> {
  public List<String[]> load(Reader reader) throws IOException {
    List<String[]> strings = new ArrayList<>();
    BufferedReader bufferedReader = new BufferedReader(reader);
    String buffer;
    while ((buffer = bufferedReader.readLine()) != null) {
      strings.add(buffer.split("\t"));
    }
    return strings;
  }
}

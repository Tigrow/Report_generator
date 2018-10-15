package loader;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import static org.junit.Assert.*;

public class TsvLoaderTest {

  private Reader reader;

  @Before
  public void setUp() throws Exception {
    byte[] data = "1\t25/11\tПавлов Дмитрий".getBytes();
    reader = new InputStreamReader(new ByteArrayInputStream(data));
  }

  @Test
  public void load() throws IOException {
    TsvLoader tsvLoader = new TsvLoader();
    List<String[]> strings = tsvLoader.load(reader);

    Assert.assertEquals(strings.get(0)[0],"1");
    Assert.assertEquals(strings.get(0)[1],"25/11");
    Assert.assertEquals(strings.get(0)[2],"Павлов Дмитрий");
  }
}
package loader;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.Reader;

public interface Loader<T> {
  T load(Reader reader) throws JAXBException, XMLStreamException;
}

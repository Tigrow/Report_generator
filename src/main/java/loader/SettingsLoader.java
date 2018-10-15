package loader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.Reader;

public class SettingsLoader {
  public static Settings loadSettings(Reader reader) throws JAXBException, XMLStreamException {
    JAXBContext jaxbContext = JAXBContext.newInstance(Settings.class);
    XMLStreamReader xmlStreamReader = XMLInputFactory.newFactory().createXMLStreamReader(reader);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    xmlStreamReader.nextTag();
    return (Settings) unmarshaller.unmarshal(xmlStreamReader);
  }
}

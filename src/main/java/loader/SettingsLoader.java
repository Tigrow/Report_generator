package loader;

import loader.setting.Settings;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.Reader;

/**
 * Класс отвечающий за загрузку XML.
 */
public class SettingsLoader implements Loader<Settings> {

  /**
   * Метол выполняющий загрузку XML и сериализацию его в Settings объект.
   *
   * @param reader - объект содержащий в себе XML
   * @return - возвращает сериализованный Settings объект
   */
  public Settings load(Reader reader) throws JAXBException, XMLStreamException {
    JAXBContext jaxbContext = JAXBContext.newInstance(Settings.class);
    XMLStreamReader xmlStreamReader = XMLInputFactory.newFactory().createXMLStreamReader(reader);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    xmlStreamReader.nextTag();
    return (Settings) unmarshaller.unmarshal(xmlStreamReader);
  }
}

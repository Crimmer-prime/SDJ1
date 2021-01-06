package SmallExample.util;

import SmallExample.model.ListOfDataObjects;
import parser.ParserException;
import parser.XmlJsonParser;

import java.io.File;

public class FileHandler {

    public static void save(ListOfDataObjects list)
    {
        saveToXML(list);
    }

    private static void saveToXML(ListOfDataObjects list)
    {
        XmlJsonParser parser = new XmlJsonParser();
        try {
            parser.toXml(list, "dataObjects.xml");
        } catch (ParserException e) {
            e.printStackTrace();
        }
    }

    private static void saveToDatabase()
    {
        //TODO: Next semester...
    }

}

import jdk.internal.org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by x3727349s on 03/10/16.
 */
public class Main {

    public static void main (String[] args) throws IOException, SAXException {

        SAXParserFactory factory = SAXParserFactory.newInstance();

        InputStream xmlInput = new FileInputStream("ACCIDENTS_GU_BCN_2015.xml");

        try {
            SAXParser saxParser = factory.newSAXParser();
            SAXHandler handler = new SAXHandler();
            saxParser.parse(xmlInput, handler);

            tractarllistat(handler);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }

    }


    public static void tractarllistat(SAXHandler sax) {

        for (Accidents acc : sax.accList) {
            System.out.println("Codi districte: " + acc.getCodiDistricte() + "\n");
        }


    }

}

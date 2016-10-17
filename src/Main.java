import org.xml.sax.SAXException;

import javax.xml.bind.Marshaller;
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
            Saxhandler handler = new Saxhandler();
            saxParser.parse(xmlInput,handler);

            MAccidents.calcularAccidentDistrictes(handler);
            MAccidents.carrerConflictiu(handler);
            MAccidents.calcularDiaAccident(handler);
            MAccidents.calcularAccidentMes(handler);
            MAccidents.accidentsTotals(handler);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }

    }

}

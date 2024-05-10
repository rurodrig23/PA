package GestioAventura;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Parse {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("elMeuFitxer.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

    }
}

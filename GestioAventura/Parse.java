package GestioAventura;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Parse {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("elMeuFitxer.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);



            List<Personaje> personajes = new ArrayList<>();
            NodeList nodeList = doc.getElementsByTagName("elMeuFitxer");
        
        
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
            }
        
}
}
}

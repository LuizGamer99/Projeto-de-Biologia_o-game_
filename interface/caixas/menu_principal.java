package caixas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class menu_principal {
    public static Document main(String[] args) {  
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("./config/textos.xml");
            return doc;         
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(menu_principal.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        
            return doc;
        }     
    }
    public static void botao_about() {
        var test = doc;
        NodeList texto = doc.getElementByTag("about");
        
    }
    

    
    
}

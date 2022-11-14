package dialogo;

import java.io.File;
import java.io.DocumentBuilderFactory;
import java.io.DocumentBuilder;
import java.io.Document;

public class menu_principal {
    File xmlFile = new File("textos.xml");
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document doc = builder.parse(xmlFile);
    doc.getElementByTagName("")

    
    
}

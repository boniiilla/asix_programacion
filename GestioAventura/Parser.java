package GestioAventura;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

class Parser {
    public static void main(String[] args) throws Exception{
        System.out.println("Llegir el XML:");
        readXMLPersonatges();

        System.out.println("Gestió de elements del joc carregat:");
        ElementsManager();

        System.err.println("Càrrega de caracteritiques dels personatges:");
        CharacteristicLoad();
    }

    private static void readXMLPersonatges() throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;

        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            File f = new File("GestioAventura/personatges.xml");
            document = builder.parse(f);
            Element e = document.getDocumentElement();
            int nPersonatges = 0;
            NodeList l = e.getElementsByTagName("personatge");
            for (int i = 0; i < l.getLength(); i++) {
                nPersonatges++;
            }
            System.out.println("Personatges del joc: " + nPersonatges);
        } catch (Exception ex) {
            System.out.println("Error en la lectura del document: " + ex);
            throw ex;
        }
    }

    private static void ElementsManager() throws Exception {}

    private static void CharacteristicLoad() throws Exception {}

}

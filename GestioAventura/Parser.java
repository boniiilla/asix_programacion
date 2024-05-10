package GestioAventura;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

class Parser {
    public static void main(String[] args) throws Exception{
        System.out.println("\nLlegir el XML:");
        readXMLPersonatges();

        System.out.println("\nGestió de elements del joc carregat: ");
        ElementsManager();

        System.err.println("\nCàrrega de caracteritiques dels personatges: ");
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
            System.out.println("\tPersonatges del joc: " + nPersonatges);
        } catch (Exception ex) {
            System.out.println("Error en la lectura del document: " + ex);
            throw ex;
        }
    }

    private static void ElementsManager() throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;

        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            File f = new File ("GestioAventura/personatges.xml");
            document = builder.parse(f);
            Element e = document.getDocumentElement();

            NodeList llistaElems = e.getElementsByTagName("nom");

            for (int i = 0; i < llistaElems.getLength(); i++) {
                Element elem = (Element)llistaElems.item(i);
                NodeList llistaFills = elem.getChildNodes();
                String text = "";
                for (int j = 0; j < llistaFills.getLength(); j++) {
                    Node n = llistaFills.item(j);
                    if ( (n.getNodeType() == Node.TEXT_NODE)||
                        (n.getNodeType() == Node.CDATA_SECTION_NODE) ) {
                
                        text += "Nom: " + n.getNodeValue();
                    }
                }

                NodeList llistaNivell = ((Element)elem.getParentNode()).getElementsByTagName("nivell");
                for (int j = 0; j < llistaNivell.getLength(); j++) {
                    Element preu = (Element)llistaNivell.item(j);
                    NodeList llistaFillsNivell = preu.getChildNodes();
                    for (int k = 0; k < llistaFillsNivell.getLength(); k++) { 
                        Node p = llistaFillsNivell.item(k);
                        if ( (p.getNodeType() == Node.TEXT_NODE)||
                            (p.getNodeType() == Node.CDATA_SECTION_NODE) ) {
                    
                            text += "\nNivell: " + p.getNodeValue();
                        }
                    }
                    System.out.println(text);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error en la lectura del document: " + ex);
        }
    }

    private static void CharacteristicLoad() throws Exception {
        Personatge voldemort = new Personatge("Voldemort", 1, 1000, 150, "Varita mortal", "Capa");
        System.out.println(voldemort.getPersonatge());
    }

}

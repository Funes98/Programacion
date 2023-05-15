package Lector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Casetas.Casetas; 
public class CargarCasetas {
	
	public Collection cargarCasetas(String path, String...rootLabel) {
		List<Casetas> listaCasetas = new ArrayList<>();
		
			File file = new File(path);	
		try {
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			
			Document document = builder.parse(file);
			document.getDocumentElement().normalize();
			
			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("DatosLeidos");
			
			
			for(int i=0; i<nodeList.getLength(); i++) {

				Element e = (Element)nodeList.item(i);
				
				//Atributo situado en la etiqueta de clase
				Element nodo = (Element)nodeList.item(i);
				
				
				//Elementos situados como nodos dentro de la clase
				String titulo = e.getElementsByTagName("TITULO").item(0).getTextContent();
				String calle = e.getElementsByTagName("CALLE").item(0).getTextContent();
				int numeros = Integer.valueOf(nodo.getElementsByTagName("NUMERO").item(0).getTextContent());
				int modulos = Integer.valueOf(nodo.getElementsByTagName("MODULOS").item(0).getTextContent());
				String clase = e.getElementsByTagName("CLASE").item(0).getTextContent();
				int id_calle = Integer.valueOf(nodo.getElementsByTagName("ID_CALLE").item(0).getTextContent());
				int id = Integer.valueOf(nodo.getElementsByTagName("ID").item(0).getTextContent());
				 
				
				Casetas caseta = new Casetas(titulo, calle,numeros, modulos, clase, id, id_calle);
				System.out.println(caseta);
				listaCasetas.add(caseta);
			}
			
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			
			e.printStackTrace();
		}
		
		
		return listaCasetas;
		
		
	}
	
	public Document getDocument(File file) throws SAXException, IOException, ParserConfigurationException {
		return 	DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
	}
	

}

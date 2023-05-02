package EuroMillon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
	File euroMillon = new File("C:\\Users\\jesus\\OneDrive\\Escritorio\\PruebaFichero\\Euromillones 2004 a 2023.csv");
	BufferedReader bufferMillon;	
	
	try {
		bufferMillon = new BufferedReader(new FileReader(euroMillon));
		String linea = bufferMillon.readLine();	
	while(bufferMillon!=null) {
		linea=bufferMillon.readLine();
		System.out.println(linea);
		String[] li = linea.split(",");
		
		//new Combinacion(Arrays.copyOfRange(li, 1, 6),
				//Arrays.copyOfRange(li, 1, 6));
		
		System.out.println(LocalDate.parse(li[0], DateTimeFormatter.ofPattern("DD/MM/YYYY")));
		
	}
	bufferMillon.close();	
		
	}catch(IOException e) {
		e.printStackTrace();
	}	
		
	}
	
	
	public void analizaResultado(File euro) {
		
		
		
	}

}

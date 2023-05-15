package Ejercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {

	private String country_id;
	private String country;
	private List<City> list_city;
	
	
	
	public Country(String country_id, String country) {
		super();
		this.country_id = country_id;
		this.country = country;
		this.list_city = new ArrayList<>();
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(country_id, country);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Country
                && this.hashCode()==((Country)obj).hashCode();
    }
	
	@Override
	public String toString() {
		return String.format("	Country id: %s, country: %s, city:%s ", this.country_id,this.country,this.list_city.size());
	}
	
	
	private void addCity() throws IOException{
		File f = new File("/C://Users//jesus//Downloads//city.txt/");
		
		BufferedReader buffer = new BufferedReader(new FileReader(f));
		
		String linea = buffer.readLine();
		
		linea = buffer.readLine();
		
		String[] arrayLinea;
		while(linea != null) {
			arrayLinea = linea.split(",");
			
			try {
				if(arrayLinea[4].equals(this.country_id)) {
					this.list_city.add(new City(arrayLinea[0], arrayLinea[1]));
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				
			}
			linea = buffer.readLine();
 
			
		}
		buffer.close();
		
		
		
		
		
	}


	public List<City> getList_city() {
		return list_city;
	}
	
	public int getSizeCity() {
		return this.list_city.size();
	}
	
	
}

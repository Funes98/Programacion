package Ejercicio;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		Country country = null;
		City city = null;
		Address address = null;
		
		try {
			country = new Country("21312312","Bratislava");
			System.out.println(country);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		try {
			city = new City("23232", "Cevilla");
			System.out.println(city);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		try {
			address = new Address("21111", "Tierra de nadie");
			System.out.println(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		GeneradorArchivo c;
		try {
			c = new GeneradorArchivo();
			c.geneadorArchivo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(city.getListAddress());
		System.out.println(country.getList_city());
		//System.out.println(c.getCountry());


	}

}

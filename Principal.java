package Mapeando;

import java.util.ArrayList;
import java.util.List;
public class Principal {

	public static void main(String[] args) {
		Mapeando mapa_personas = new Mapeando();
		
		
		List<Persona> lista_personas = new ArrayList<>();
		Persona juan = new Persona("juan", "perez", Genero.MASCULINO);
		Persona pepe = new Persona("pepe", "perez", Genero.MASCULINO);
		Persona isa = new Persona("isa", "perez", Genero.FEMENINO);
		Persona berta = new Persona("berta", "perez", Genero.FEMENINO);
		
		lista_personas.add(juan);
		lista_personas.add(pepe);
		lista_personas.add(isa);
		lista_personas.add(berta);
		
		

		System.out.println(mapa_personas.mapearPersonasPorGenero((lista_personas)));
		
		
		
		Mapeando mapa_numeros = new Mapeando();
		
		
		List<Integer> lista_numeros = new ArrayList<>();
		
		lista_numeros.add(1);
		lista_numeros.add(5);
		lista_numeros.add(2);
		

		System.out.println(mapa_numeros.contarNumeros(lista_numeros));

	}

}

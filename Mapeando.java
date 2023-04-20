package Mapeando;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
public class Mapeando {
	
	
	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public Map mapearPersonasPorGenero(Collection<Persona> personas) {
		Map<Genero, Collection<Persona>> mapa_genero = new HashMap<>();
		
		for (Persona i: personas) {
			if(!mapa_genero.containsKey(i.getGenero())) {
				//actualiza orden
				mapa_genero.put(i.getGenero(), new HashSet<>());
			}
			//add coleccion ordenada 
			mapa_genero.get(i.getGenero()).add(i);
		}
		
	return mapa_genero;}
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		Map<Integer, Integer> cuenta_numeros = new HashMap<>();
			for(Integer i : numeros) {
				if(!cuenta_numeros.containsKey(i)) {
					//si no contiene numero su numero de apariciones es 0
					cuenta_numeros.put(i, 0);
				}
				//suma 1 cada vez que contenga el numero
				cuenta_numeros.put(i,cuenta_numeros.get(i)+1);
			}
		
		
		
	return cuenta_numeros;}
	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}

}

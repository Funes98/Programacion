package Casetas;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import Lector.CargarCasetas;

public class Casetas {
	private String titulo;
	private String calle;
	private int numeros;
	private int modulos;
	private String clase;
	private int id;
	private int id_calle;
	
	
	
	
	
	
	public Casetas(String titulo, String calle, int numeros, int modulos, String clase, int id, int id_calle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numeros = numeros;
		this.modulos = modulos;
		this.clase = clase;
		this.id = id;
		this.id_calle = id_calle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo, id);
	}
	
	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Casetas
                && this.hashCode()==((Casetas)obj).hashCode();
    }


	@Override
	public String toString() {
		return "Casetas [titulo=" + titulo + ", calle=" + calle + ", modulos=" + modulos + ", clase=" + clase + ", id="
				+ id + ", id_calle=" + id_calle + "]";
	}
	
	
	private void mostrarCasetasCalles(String ID_calle) {
		
		
		List<Integer> lista= new ArrayList<>(this.id);
		Collections.sort(lista);
		
		for(int i =0; i<lista.size(); i++) {
			
			
			if(ID_calle.equals(this.id_calle)) {
				System.out.println(lista[i]);
				
			}
		}
		
		
	}
	
	
	private void mostrarCasetasFamiliar() {
		
		
		
		
	}


	public String getTitulo() {
		return titulo;
	}


	public String getCalle() {
		return calle;
	}


	public String getModulos() {
		return modulos;
	}


	public String getClase() {
		return clase;
	}


	public String getId() {
		return id;
	}


	public String getId_calle() {
		return id_calle;
	}
	
	
	
	
	
	
	

}

package Aparcamiento;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Parking {
	private Vehiculo[] vehiculos; 
	
	private final static int MAX_CAPACITY = 50;
	
	public Parking() {
		super();
		this.vehiculos = new Vehiculo[MAX_CAPACITY];
	}
	
	//Se añade get de vehiculo para mostrar los vehiculos que hay
    //aunque no sea lo idoneo
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	
	//ToDo
	public boolean addVehiculoToParking(Vehiculo v) {
		
		return false;
	}
	
	//ToDo
	public Vehiculo sacarVehiculo(String matricula) {
		return null;
	}
	
	//ToDo
	public String mostrarVehiculosOrdenadosPorFecha() {	
		
		return "" ;
	}
	
	//ToDo
	public String mostrarVehiculosOrdenadosPorMarcaYModelo() {
		return"";
	}

	//ToDo
	public String mostrarVehiculosOrdenadosPorTipoYCombustible() {
		return "";
	}
	
	//ToDo
	public String mostrarVehiculosOrdenadosPorMatricula() {
		
		Arrays.sort(this.vehiculos);
		return arrayToString(this.vehiculos);
	}
	
	
	private String arrayToString(Object[] objs) {
		StringBuilder sb= new StringBuilder();
		for (Object o :objs) {
			if(o!=null) {
			sb.append(o).append("/n");
		}
	}
	return "";}
	
	
	public int compareTo(Vehiculo c) {
		return this.compareTo(c);
	}


}
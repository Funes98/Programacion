package Aparcamiento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import SieteYMedia.Carta;

public class Principal {

	public static void main(String[] args) {
	Parking mercadona = new Parking();	
	Vehiculo[] listaVehiculos= new Vehiculo[50];
	listaVehiculos[0]=new Vehiculo("seat","panda","2345rrrr",
			Combustible.GASOLINA,LocalDateTime.now(),
			TipoVehiculo.AUTOMOVIL);
	
	listaVehiculos[1]=new Vehiculo("ferrari","f28","4551rttr",
			Combustible.GASOLINA,LocalDateTime.now(),
			TipoVehiculo.AUTOMOVIL);
	
	
	System.out.println(listaVehiculos[0].toString());
	System.out.println(listaVehiculos[1].toString());
	//System.out.println(Parking.mostrarVehiculosOrdenadosPorMatricula());
    //System.out.println(listaVehiculos[0].esMatriculaValida());
	//System.out.println(listaVehiculos[1].esMatriculaValida());
	
	
	
	
	
	

	}

}

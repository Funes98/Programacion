package Aparcamiento;

import java.time.LocalDateTime;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDateTime fechaEntrada;
	private TipoVehiculo tipoVehiculo;
	
	
	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible, LocalDateTime fechaEntrada,
			TipoVehiculo tipoVehiculo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		
		if (matricula.length()==8 && esMatriculaValida(matricula)==true) {
			this.matricula=matricula;
		}else {
			System.out.println("Matricula no valida");
		}
		
		try{
			this.combustible = combustible;
		}catch(Exception e) {
			System.out.println("combustible no valido");
		}
		
		try{
			this.tipoVehiculo =tipoVehiculo;
		}catch(Exception e) {
			System.out.println("tipo de vehiculo no valido");
		}
		
		
	    
		this.fechaEntrada = fechaEntrada;
		
	}
	
	
	public boolean esMatriculaValida(String matricula) {
		int contNum=0;
		
		boolean valida=false;
			if(matricula.length()==8) {
				
				for(int i=0; i<matricula.length();i++) {
					if (Character.isDigit(matricula.charAt(i))){
					contNum++;	
						
					}
				}
				if (contNum==4) {
					valida=true;
				}
					
				}	
				
	return valida;}
	
	public int compareTo(Vehiculo o) {
		
	return this.fechaEntrada.compareTo(fechaEntrada);	
	}
			
	
	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public String getMatricula() {
		return matricula;
	}
	
	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj != null && obj instanceof Vehiculo) {
			Vehiculo casteado = (Vehiculo)obj;
			
			
			
			sonIguales = casteado.marca.equals(this.marca) && 
					casteado.modelo.equals(this.modelo) && 
					casteado.matricula.equals(this.matricula) && 
					casteado.combustible.equals(this.combustible) &&
					casteado.fechaEntrada.equals(this.fechaEntrada) &&
					casteado.tipoVehiculo.equals(this.tipoVehiculo);
		}
		return sonIguales;
	}


	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", combustible="
				+ combustible + ", fechaEntrada=" + fechaEntrada + ", tipoVehiculo=" + tipoVehiculo + "]";
	}
	
	
	
	
	
	
	
	
}

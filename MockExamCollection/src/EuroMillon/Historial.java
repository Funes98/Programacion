package EuroMillon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Historial {
	Map<LocalDate, Combinacion>sorteos;

	public Historial(Map<LocalDate, Combinacion> sorteos) {
		super();
		this.sorteos = new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fechaSorteo, Combinacion combi) throws HistorialException {
		boolean valida=false;
		if (!this.sorteos.containsKey(combi)) {
			this.sorteos.put(fechaSorteo, combi);
			valida= true;
		}else {
			throw new HistorialException("Error, el sorteo ya esta incluido");
			
		}
	
	return valida;}
	
	
	public boolean addSorteo(int dia, int mes, int anyo, Combinacion combi) throws HistorialException {
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		return addSorteo(fecha,combi);
	}
	
	public boolean actualizarSorteo(LocalDate fechaSorteo, Combinacion combi) throws HistorialException {
		return this.sorteos.replace(fechaSorteo, this.sorteos.get(fechaSorteo), combi);}
	
	public boolean actualizarSorteo(int dia, int mes, int anyo, Combinacion combi) throws HistorialException {
		LocalDate nueva_fecha = LocalDate.of(anyo, mes, dia);
		return actualizarSorteo(nueva_fecha,combi);
	
	}
	
	public boolean borrarSorteos(LocalDate fecha) {
		//java me obliga a ponerlo pero no entiendo el por que
		return this.sorteos.remove(fecha) != null;
	}
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		List<String> listafecha = new ArrayList<>();
		
		for(LocalDate l : this.sorteos.keySet()) {
			if(l.isAfter(fecha)) {
				listafecha.add(this.sorteos.get(l).toString());
			}
		}
		
		return listafecha;
		}
	
	public List<String> mostrarHistorico(){
		List<String> listaHistorico = new ArrayList<>();
		
		
		for(LocalDate l : this.sorteos.keySet()) {
			listaHistorico.add(this.sorteos.get(l).toString());
		}
		
		return listaHistorico;}
	
	
	public Map<String, Integer> comprobarAciertos(LocalDate fechaSorteo, Combinacion combinacion) throws CombinacionException{
		Map<String, Integer> aciertos = new HashMap<>();		
		//////
	}
	
}




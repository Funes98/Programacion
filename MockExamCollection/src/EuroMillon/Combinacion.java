package EuroMillon;

import java.util.Objects;
import java.util.Set;

public class Combinacion {
	private static final int VALOR_MINIMO=1;
	private static final int VALOR_MAXIMO=50;
	private static final int VALOR_MAXIMO_ESTRELLAS=12;
	private static final int TOTAL_NUMEROS=5;
	private static final int TOTAL_ESTREALLAS=2;
	
	private Set<Integer>conjuntoNumeros;
	private Set<Integer>conjuntoEstrellas;
	
	public Combinacion(Set<Integer> conjuntoNumeros, Set<Integer> conjuntoEstrellas) throws CombinacionException {
		super();
		this.conjuntoNumeros = conjuntoNumeros;
		this.conjuntoEstrellas = conjuntoEstrellas;
	}

	public Set<Integer> getConjuntoNumeros() {
		return conjuntoNumeros;
	}

	public Set<Integer> getConjuntoEstrellas() {
		return conjuntoEstrellas;
	}
	
	public int hashCode() {
		return Objects.hash(conjuntoEstrellas, conjuntoNumeros);
	}
	
	public boolean equals(Object obj) {
		return this==obj || obj!=null &&
	            obj instanceof Combinacion
	            && this.hashCode()==((Combinacion)obj).hashCode();
	}
	
	public String toString() {
		return String.format("Combinacion numeros: %s y estrellas: %s",
				this.conjuntoNumeros,this.conjuntoEstrellas);
	}
	
	

}

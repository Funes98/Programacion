package Casetas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion = 1;
		
		while(opcion>0 && opcion<8) {
			
		System.out.println("1.Mostrar todas las casetas existentes en una calle");
		System.out.println("2.Mostrar todas las casetas de tipo familiar");	
		System.out.println("3.Mostrar todas las casetas que no sean distrito");
		System.out.println("4.Mostrar todas las casetas que no sean familiares ni distritos");
		System.out.println("5.Mostrar para cada una de las calles del recinto ferial el"
				+ " número de casetas de tipo familiar que existen");
		System.out.println("6. Mostrar para cada una de las calles del recinto ferial el número de casetas "
				+ "de tipo Distrito que existen");
		System.out.println("7.Eliminar Caseta");
		System.out.println("8.Salir");
		opcion = Integer.valueOf(sc.nextLine());
		
		
		if (opcion==1) {
			String id_calle;
			System.out.println("Dime el id de la calle: ");
			id_calle=String.valueOf(sc.nextLine());
			
		}else if (opcion==2) {
			
		}else if (opcion==3) {
			
		}else if (opcion==4) {
			
		}else if (opcion==5) {
			
		}else if (opcion==6) {
			
		}else if (opcion==7) {
			String id;
			System.out.println("Dime el id de la caseta que quieres borrar: ");
			id=String.valueOf(sc.nextLine());
			
		}else if (opcion==8) {
			
		}
			
		}
		
		
		

	}

}

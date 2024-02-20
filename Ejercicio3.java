package B0;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Random random=new Random();
		
		int numeroSecreto=random.nextInt(100)+1;
		
		int num;
		do {
			System.out.println("Dime un numero: ");
			num=sc.nextInt();
			
			if (num>numeroSecreto) {
				System.out.println("El numero que has introducido es mayor");
			}else if (num==numeroSecreto){
				System.out.println("Enorabuena, has acertado");
			}else {
				System.out.println("El numero que has introducido es menor");
			}
			
		}while(num!=numeroSecreto);

	}

}

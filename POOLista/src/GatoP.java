import java.util.Scanner;

public class GatoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gato gt = new Gato();
		Gato gt2 = new Gato();
		
		System.out.println("-----------------------");
		gt.miar();
		System.out.println("-----------------------");
		
		System.out.println("Como é o nome do seu primeiro pet?");
		gt.nome = sc.next();
		
		System.out.println("-----------------------");
		gt.comer();
		System.out.println("-----------------------");
		
		System.out.println("Qual é a raca do seu primeiro pet?");
		gt.raca = sc.next();
		
		System.out.println("Qual idade do seu primeiro pet?");
		gt.idade = sc.nextInt();
		
		gt.mostrarInformacoes();
		
		
		System.out.println("-----------------------");
		gt2.miar();
		System.out.println("-----------------------");
		
		System.out.println("Como é o nome do seu segundo pet?");
		gt2.nome = sc.next();
		
		System.out.println("-----------------------");
		gt2.comer();
		System.out.println("-----------------------");
		
		System.out.println("Qual é a raca do seu segundo pet?");
		gt2.raca = sc.next();
		
		System.out.println("Qual idade do seu segundo pet?");
		gt2.idade = sc.nextInt();
		
		gt2.mostrarInformacoes();
	
		
	}

}

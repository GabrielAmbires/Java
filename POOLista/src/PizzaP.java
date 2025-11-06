import java.util.Scanner;

public class PizzaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza pz = new Pizza();
		
		Pizza pz2 = new Pizza();
		
		System.out.println("Qual o sabor da sua Pizza?");
		pz.sabor = sc.next();
		
		System.out.println("----------------------------------");
		
		System.out.println("Qual tamanho da sua Pizza (P,M,G)");
		pz.tamanho = sc.next();
		
		System.out.println("----------------------------------");
		
		pz.preparar();
		
		System.out.println("----------------------------------");
		
		pz.assando();
		
		System.out.println("----------------------------------");
		
		System.out.println("Vai Querer Borda Recheada? (True/False)");
		pz.bordaRecheada = sc.nextBoolean();
		
		System.out.println("----------------------------------");
		
		pz.mostrarInformacoes();
		
		System.out.println("Qual o sabor da sua Pizza?");
		pz2.sabor = sc.next();
		
		System.out.println("----------------------------------");
		
		System.out.println("Qual tamanho da sua Pizza (P,M,G)");
		pz2.tamanho = sc.next();
		
		System.out.println("----------------------------------");
		
		pz2.preparar();
		
		System.out.println("----------------------------------");
		
		pz2.assando();
		
		System.out.println("----------------------------------");
		
		System.out.println("Vai Querer Borda Recheada? (True/False)");
		pz2.bordaRecheada = sc.nextBoolean();
		
		System.out.println("----------------------------------");
		
		pz2.mostrarInformacoes();
	}

}

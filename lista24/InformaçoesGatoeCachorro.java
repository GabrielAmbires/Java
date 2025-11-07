package lista24;

import java.util.Scanner;

public class InformaçoesGatoeCachorro {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Gato g1 = new Gato();
		Scanner sc = new Scanner(System.in);
		
		String nome, raca, cor;
		int idade;
		System.out.println("Qual o Nome do Gato? ");
		nome = sc.next();
		
		System.out.println("Qual idade do Gato?");
		idade = sc.nextInt();
		
		System.out.println("Qual a Cor do Gato? ");
		cor = sc.next();
		
		g1.setNome(nome);
		g1.setIdade(idade);
		g1.setCor(cor);
		g1.mostrarinfo();
		g1.subirNoMuro();
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Qual o Nome do Cachorro? ");
		nome = sc.next();
		
		System.out.println("Qual idade do Cachorro?");
		idade = sc.nextInt();
		
		System.out.println("Qual a raca do Cachorro? ");
		raca = sc.next();
		
		c1.setNome(nome);
		c1.setIdade(idade);
		c1.setRaca(raca);
		c1.mostrarinfo();
		c1.abanarRabo();
	}

}

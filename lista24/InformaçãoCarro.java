package lista24;

import java.util.Scanner;

public class InformaçãoCarro {

	public static void main(String[] args) {
		Carro car = new Carro();
		Scanner sc = new Scanner(System.in);
		
		String carro;
		int ano, portas;
		
		System.out.println("Qual A Marca do Carro? ");
		carro = sc.next();
		
		System.out.println("Qual o Ano do Carro? ");
		ano = sc.nextInt();
		
		System.out.println("Quantas Portas tem o Carro? ");
		portas = sc.nextInt();
		
		car.setMarca(carro);
		car.setAno(ano);
		car.setPortas(portas);
		
		car.exibirInfo();
		car.abrirPortaMalas();
	}

}

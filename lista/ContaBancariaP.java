package lista;

import java.util.Scanner;

public class ContaBancariaP {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o Nome do Titular? ");
		String nome = sc.next();
		
		System.out.println("Quanto Você Quer Sacar?");
		double sacar = sc.nextDouble();
		
		System.out.println("Quanto Você Quer Depositar?");
		double depositar = sc.nextDouble();
		
		conta.setTitular(nome);
		conta.sacar(sacar);
		conta.depositar(depositar);
		
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());

	}

}

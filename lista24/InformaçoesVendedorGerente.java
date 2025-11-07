package lista24;

import java.util.Scanner;

public class InformaçoesVendedorGerente {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor();
		Gerente gr1 = new Gerente();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gerente");
		
		/*Gerente*/
		String nome, departamento;
		double salario;
		
		System.out.println("Qual Seu Nome? ");
		nome = sc.next();
		
		System.out.println("Qual Seu Salario Base? ");
		salario = sc.nextDouble();
		
		System.out.println("Qual O Seu Departamento? ");
		departamento = sc.next();
		
		gr1.setNome(nome);
		gr1.setSalarioBase(salario);
		gr1.setDepartamento(departamento);
		gr1.exibirInfo();
		gr1.gerenciar();
		System.out.println("Novo Salario Com a Comissão: " +gr1.calcularSalario());
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Vendedor");
		
		/*Vendedor*/
		String nome1;
		double salario1;
		
		System.out.println("Qual Seu Nome?");
		nome1 = sc.next();
		
		System.out.println("Qual Seu Salario Base");
		salario1 = sc.nextDouble();
		
		v1.setNome(nome1);
		v1.setSalarioBase(salario1);
		v1.exibirInfo();
		v1.vender();
		System.out.println("Novo Salario Com a Comissão Ficou " + v1.calcularSalario());
	}
}

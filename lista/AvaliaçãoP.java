package lista;

import java.util.Scanner;

public class AvaliaçãoP {

	public static void main(String[] args) {
		Avaliação avl = new Avaliação();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual Seu Nome?");
		String nome = sc.next();
		
		System.out.println("Qual Foi Sua 1 Nota? ");
		double nota1 = sc.nextDouble(); 
		
		System.out.println("Qual Foi Sua 2 Nota? ");
		double nota2 = sc.nextDouble();
		
		avl.setNome(nome);
		avl.setNota1(nota1);
		avl.setNota2(nota2);
		
		double soma = (nota1 + nota2) / 2;
		
		System.out.println("Aluno: "+ nome);
		System.out.println("Sua média foi: "+ soma);
	}

}

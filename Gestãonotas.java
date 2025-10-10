import java.util.Scanner;

public class Gestãonotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Informaões
		String nome;
		int idade;
		System.out.println("Qual Seu Nome?");
		nome = sc.next();
		System.out.println("Qual Ano Você Esta?");
		idade = sc.nextInt();
		System.out.println("Seja Bem vindo! "+nome);
		
		System.out.println("-----------------------------");
		
		
		//Média
		System.out.println("Iniciamento da sua média");
		double notas1, notas2, notas3;
		System.out.println("Digite Sua Primeira Nota?");
		notas1 = sc.nextDouble();
		System.out.println("Digite Sua Segunda Nota?");
		notas2 = sc.nextDouble();
		System.out.println("Digite Sua Primeira Nota?");
		notas3 = sc.nextDouble();
		double notasfinal = ( notas1 + notas2 + notas3 ) / 3;
		System.out.println("Sua média é "+ notasfinal);
		
		if (notasfinal < 7 & notasfinal  > 5) {
		System.out.println("Recuperação");
		} else if (notasfinal >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		System.out.println("-------------------------------------");
		
		//Informaçoes Finais
		System.out.println("Informaçoes Finais");
		System.out.println("Nome "+ nome);
		System.out.println("Nota 1 = "+ notas1);
		System.out.println("Nota 2 = "+ notas2);
		System.out.println("Nota 3 = "+ notas3);
		System.out.println("Sua Média Foi = "+ notasfinal);
		if (notasfinal < 7 & notasfinal  > 5) {
		System.out.println("Recuperação");
		} else if (notasfinal >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		System.out.println("--------------------------------------------");
		
		//Finalização
		System.out.println("Você deseja verificar a situação do aluno? ");
		String texto1 = sc.next();
		while(!texto1.equalsIgnoreCase("sim")) {
			System.out.println("Você deseja verificar a situação do aluno? ");
			texto1 = sc.next();
		}
		System.out.println("Sistema Finalizado!");
		
		
		
		
		}

}

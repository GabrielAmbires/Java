package lista;

import java.util.Scanner;

public class AlunoP {

	public static void main(String[] args) {
		Aluno aln = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String nome = sc.next();
		
		System.out.println("Qual Idade?");
		int idd = sc.nextInt();
		
		aln.setNome(nome);
		aln.setIdade(idd);
		System.out.println("Nome: "+aln.getNome());
		System.out.println("Idade: "+aln.getIdade());
	}
}

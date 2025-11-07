package lista24;

import java.util.Scanner;

public class InformaçoesLivroFilme {

	public static void main(String[] args) {
		Livro lv = new Livro();
		Filme fm = new Filme();
		Scanner sc = new Scanner(System.in);
		
		/*Filme*/
		String nome, diretor;
		double preco;
		System.out.println("Qual o Nome Do Filme? ");
		nome = sc.next();
		
		System.out.println("Qual o Diretor Do Filme? ");
		diretor = sc.next();
		
		System.out.println("Qual o Preço do Filme? ");
		preco = sc.nextDouble();
		
		fm.setNome(nome);
		fm.setDiretor(diretor);
		fm.setPreco(preco);
		
		fm.getNome();
		fm.getPreco();
		fm.getDiretor();
		
		fm.mosntrarInfo();
		fm.assistir();
		
		/*Livro*/
		String nome1, autor;
		double preco1;
		System.out.println("Qual o Nome do Livro? ");
		nome1 = sc.next();
		
		System.out.println("Qual o Autor Do Livro? ");
		autor = sc.next();
		
		System.out.println("Qual o Preço do Livro? ");
		preco1 = sc.nextDouble();
		
		lv.setNome(nome1);
		lv.setAutor(autor);
		lv.setPreco(preco1);
		
		lv.mosntrarInfo();
		lv.lerTrecho();
	}
}

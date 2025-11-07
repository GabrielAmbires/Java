package lista;

import java.util.Scanner;

public class ProdutoP {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o Produto? ");
		String prdt = sc.next();
		
		System.out.println("Qual o Preço do Produto? ");
		double preco = sc.nextDouble();
		
		System.out.println("Qual o Estoque do Produto? ");
		int estoque = sc.nextInt();
		
		produto.setNome(prdt);
		produto.setPreco(preco);
		produto.setEstoque(estoque);
		
		System.out.println("Produto: "+produto.getNome());
		System.out.println("Preço: "+produto.getPreco());
		System.out.println("Estoque: "+produto.getEstoque());
	}

}

import java.util.Scanner;

public class ProdutoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Produto p1 = new Produto("Camisa", 79.90, 10);
		Produto p2 = new Produto("Calça", 129.90, 5);

		System.out.println("Informações Iniciais");
		p1.mostrarInformacoes();
		p2.mostrarInformacoes();

		System.out.print("Digite a quantidade de camisas que deseja vender: ");
		int qtd = sc.nextInt();
		p1.vender(qtd);

		System.out.println("Informações Atualizadas");
		p1.mostrarInformacoes();
		p2.mostrarInformacoes();
	}
}
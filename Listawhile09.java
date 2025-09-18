import java.util.Scanner;

public class Listawhile09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}

		// 2
		int cont = 10;
		while (cont >= 1) {
			System.out.println(cont);
			cont--;
		}

		// 3
		int numero = 0;
		while (numero <= 100) {
			System.out.println(numero);
			numero += 5;
		}

		// 4
		int num = 1;
		while (num <= 5) {
			System.out.println("Eu gosto de Java");
			num++;
		}

		// 5
		int cont1 = 1;
		while (cont1 <= 5) {
			System.out.println("Digite um numero inteiro");
			sc.nextInt();
			cont1++;
		}

		// 6
		int senha = 0;

		while (senha != 1234) {
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();

			if (senha != 1234) {
				System.out.println("Senha incorreta. Tente novamente.");
			}
			System.out.println("Senha Correta");
		}

		// 7
		System.out.print("Digite um número inteiro: ");
		int cont11 = sc.nextInt();
		while (cont11 >= 1) {
			System.out.println(cont11);
			cont11--;
		}
	}
}

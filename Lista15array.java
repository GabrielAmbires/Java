import java.util.Scanner;

public class Lista15array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1
		String[] frutas = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("frutas[" + i + "]: ");
			frutas[i] = scanner.next();
		}
		for (int i = 0; i < 5; i++) { /* Dados gravasdos */
			System.out.println(frutas[i]);
		}

		System.out.println("-----------------------------------");

		// 2
		int[] num = new int[11];
		for (int i = 1; i < 10; i++) {
			System.out.println("Digite 1 Número inteiro[" + i + "]: ");
			num[i] = scanner.nextInt();
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(num[i]);
		}

		System.out.println("-----------------------------------");

		// 3
		int[] num1 = new int[11];
		for (int i = 1; i < 7; i++) {
			System.out.println("Digite um número [" + i + "]: ");
			num1[i] = scanner.nextInt();
		}
		for (int i = 6; i >= 0; i--) {
			System.out.println(num1[i]);
		}

		System.out.println("-----------------------------------");

		// 4
		int[] nume = new int[11];
		for (int i = 1; i < 10; i++) {
			System.out.println("Digite 1 Número inteiro[" + i + "]: ");
			nume[i] = scanner.nextInt();
			System.out.println(nume[i]);
			if (nume[i] > 100) {
				System.out.println("É maior que 100");
			} else {
				System.out.println("É menor que 100");
			}
		}

		System.out.println("-----------------------------------");

		// 5
		int[] numeros2 = new int[8];
		for (int i = 0; i < 8; i++) {
			System.out.print("Digite o " + (i + 1) + " número: ");
			numeros2[i] = scanner.nextInt();
		}
		System.out.print("Digite o número para procurar: ");
		int procurar = scanner.nextInt();

		int contador = 0;
		for (int i = 0; i < 8; i++) {
			if (numeros2[i] == procurar) {
				contador++;
			}
		}

		if (contador > 0) {
			System.out.println("O número existe");
		} else {
			System.out.println("O número não existe");
		}

		System.out.println("-----------------------------------");

		// 6

		String[] pessoas = new String[5];
		int[] idades = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
			pessoas[i] = scanner.next();
			System.out.print("Digite a idade" + pessoas[i] + ": ");
			idades[i] = scanner.nextInt();
		}
		System.out.println("------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(pessoas[i] + " tem " + idades[i] + " anos");
		}

		System.out.println("-----------------------------------");

		// 7
		int[] idd = new int[11];
		for (int i = 1; i < 10; i++) {
			System.out.println("Qual sua idade[" + i + "]: ");
			idd[i] = scanner.nextInt();
			System.out.println(idd[i]);
			if (idd[i] < 18) {
				System.out.println("Você é menor de idade");
			}
		}

		System.out.println("-----------------------------------");

		// 8
		double[] salarios = new double[7];
		for (int i = 0; i < 7; i++) {
			System.out.print("Digite o salário da pessoa " + (i + 1) + ": ");
			salarios[i] = scanner.nextDouble();
			if (salarios[i] <= 2500) {
				System.out.println("Você receberá um aumento");
			}
		}

	}

}

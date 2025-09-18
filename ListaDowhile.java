import java.util.Scanner;

public class ListaDowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1
		int numero = 1;
		do {
			System.out.println(numero);
			numero += 2;
		} while (numero <= 31);

		System.out.println("---------------------------------");

		// 2
		int secreto = 100;
		int escolha = 0;
		do {
			System.out.println("Escolha um numero: ");
			escolha = sc.nextInt();
			if (escolha > secreto) {
				System.out.println("é menor");
			} else if (escolha < secreto) {
				System.out.println("é maior");
			}
		} while (secreto != escolha);
		System.out.println("Você Acertou foi o numero 100");

		System.out.println("---------------------------------");
		
		// 3
		int opcao = 0;

		while (opcao != 2) {
			System.out.println("1 - Continuar");
			System.out.println("2 - Sair");
			System.out.print("Escolha uma opção: ");

			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Você escolheu continuar!");
			} else if (opcao == 2) {
				System.out.println("Você escolheu sair");
			} else {
				System.out.println("Opção inválida");
			}
		}

		System.out.println("---------------------------------");
		
		// 4
		int contador2 = 1;

		while (contador2 <= 5) {
			System.out.print("Digite o " + contador2 + "º número: ");
			int numero3 = sc.nextInt();

			if (numero3 < 10) {
				System.out.println("Tipo A");
			} else if (numero3 < 20) {
				System.out.println("Tipo B");
			} else {
				System.out.println("Fora da Categoria");
			}

			contador2++;
		}
		
		System.out.println("---------------------------------");
		
		// 5
		int temperatura = 0;

		System.out.print("Digite a temperatura atual do forno: ");
		temperatura = sc.nextInt();

		while (temperatura >= 200) {
			System.out.println("⚠️ Alerta! Temperatura muito alta!");
			System.out.print("Digite uma nova leitura da temperatura: ");
			temperatura = sc.nextInt();
		}

		System.out.println("✅ Temperatura dentro da faixa segura: " + temperatura + "°C");
		
		System.out.println("---------------------------------");
		
		// 6
		int bateria;

		System.out.print("Digite o nível atual da bateria (%): ");
		bateria = sc.nextInt();

		while (bateria <= 20) {
			System.out.println("⚠️ Bateria baixa!");
			System.out.print("Digite uma nova leitura da bateria (%): ");
			bateria = sc.nextInt();
		}

		System.out.println("✅ Nível de bateria suficiente: " + bateria + "%");
		
		System.out.println("---------------------------------");

		// 7
		System.out.print("Deseja fazer uma conta? (sim/não): ");
		String resposta = sc.next();

		if (resposta.equalsIgnoreCase("sim")) {
			System.out.print("Digite o primeiro número: ");
			int num1 = sc.nextInt();

			System.out.print("Digite o segundo número: ");
			int num2 = sc.nextInt();

			int soma = num1 + num2;
			System.out.println("Resultado da soma: " + soma);
		} else {
			System.out.println("Ok, programa encerrado.");

		}

	}

}

import java.util.Scanner;

public class Lista12DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1
		int contador = 10;
		do {
			System.out.println(contador);
			contador++; // +
		} while (contador <= 30);

		System.out.println("-------------------------------");

		// 2
		int senha;
		do {
			System.out.println("Adivinhe o Numero ");
			senha = scanner.nextInt();
		} while (senha != 5);
		System.out.println("Acertou o Numero");

		System.out.println("-------------------------------");

		// 3
		int mala;
		do {
			System.out.println("Qual peso da sua mala em (KG) ? ");
			mala = scanner.nextInt();
			if (mala > 23) {
				System.out.println("Peso Excedido");
			}
		} while (mala > 23);
		System.out.println("Peso esta dentro do limite");

		System.out.println("-------------------------------");

		// 4
		int dias = 1;
		int pgn = 0;
		do {
			System.out.println("Quantas paginas voce leu hoje?");
			int passos = scanner.nextInt();
			pgn = pgn + passos;
			dias++;
		} while (dias <= 7);
		System.out.println("Você leu  " + pgn + " Durante 1 Semana");

		System.out.println("-------------------------------");

		// 5
		int senha11;
		do {
			System.out.println("Digite a senha de 3 digitos ");
			senha11 = scanner.nextInt();
		} while (senha11 != 789);
		System.out.println("Acertou a Senha");

		// 6
		int comb1;
		do {
			System.out.println("Quando de Gasolina você esta em (LITROS) ? ");
			comb1 = scanner.nextInt();
			if (comb1 >= 10) {
				System.out.println("Combustível está Suficiente");
			} else {
				System.out.println("Combustível Baixo");
			}
		} while (comb1 < 10);
		
		System.out.println("-------------------------------");
		
		//7
		int distancia;
		int total = 0;
		do {
			System.out.println("Qual distancia percorrida ( 0 ou negatico encerrara) ");
			distancia = scanner.nextInt();
			
			if(distancia > 0);
			total += distancia;
			distancia++;
		} while (distancia > 0);
		System.out.println("Total de KM percorrido foi "+  total);
	}
}

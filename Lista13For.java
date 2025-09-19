import java.util.Scanner;

public class Lista13For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1
		for (int cont = 10; cont <= 30; cont++) {
			System.out.println(cont);
		}

		System.out.println("-----------------------------------------------");

		// 2
		for (int idade = 1; idade <= 10; idade++) {
			System.out.println("Qual Sua idade? ");
			int idd = scanner.nextInt();
			if (idd > 18) {
				System.out.println("Maior de Idade ");
			} else {
				System.out.println("Menor de Idade");
			}
		}
		
		System.out.println("-----------------------------------------------");
		
		// 3
		System.out.println("Qual seu Voto? (1 - Candidato, 2 - Candidato, 3 - Candidato, 4 - Candidato, 5 - Voto Nulo, 6 - Voto em Banco");
        for (int elei = 1; elei <= 5; elei++) {
            System.out.print("Digite o código do voto #" + elei + ": ");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    System.out.println("Candidato 1");
                    break;
                case 2:
                    System.out.println("Candidato 2");
                    break;
                case 3:
                    System.out.println("Candidato 3");
                    break;
                case 4:
                    System.out.println("Candidato 4");
                    break;
                case 5:
                    System.out.println("Voto nulo");
                    break;
                case 6:
                    System.out.println("Voto em branco");
                    break;
                default:
                    System.out.println("Código inválido");
                    break;
            }
        }

		System.out.println("-----------------------------------------------");
		
		//4
		System.out.println("Digite uma frase");
		String text = scanner.next();
		System.out.println("Quantas vezes você quer ver a frase?");
		int vezes = scanner.nextInt();
		for(int texto = 1; texto <= vezes; texto++) {
		System.out.println(text);		
		}
		
		System.out.println("-----------------------------------------------");
		
		// 5
			for (int cont1 = 50; cont1 >= 30; cont1--) {
				System.out.println(cont1);
		}
			
		System.out.println("-----------------------------------------------");
			
		// 6
        for (int conta = 0; conta <= 50; conta+=2) {
				System.out.println(conta);
        }
        
        System.out.println("-----------------------------------------------");
        
        // 7
        for (int quant = 1; quant <= 5; quant++) {
			System.out.println("Me fale 5 notas ");
			int quanti = scanner.nextInt();
			if (quanti > 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
        }
        
        System.out.println("-----------------------------------------------");
        
        // 8
        for (int idade1 = 1; idade1 <= 10; idade1++) {
			System.out.println("Qual Sua idade? ");
			int idd1 = scanner.nextInt();
			if (idd1 > 18) {
				System.out.println("Maior de Idade ");
			} else {
				System.out.println("Menor de Idade");
			}
		}
        
        System.out.println("-----------------------------------------------");
        
        // 9
        for (int num = 1; num <= 7; num++) {
			System.out.println("Me fale um numero? ");
			int num2 = scanner.nextInt();
			if (num2 > 0) {
				System.out.println("Possitivo");
			} else {
				System.out.println("Negativo");
			}
		}
        
        System.out.println("-----------------------------------------------");
        
	}
}

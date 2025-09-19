import java.util.Scanner;

public class Lista14For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1
		for(int cont = 1; cont <= 10; cont++) {
			System.out.println(cont);
		}
		
		System.out.println("------------------------------");
		
		// 2
		int num2 = 0;
		for(int num = 1; num <= 100; num++) {
			num2 = num2 + num;
		}
		System.out.println(num2);
		
		System.out.println("------------------------------");
		
		// 3
		for(int cont1 = 0; cont1 <= 20; cont1+=2) {
			System.out.println(cont1);
		}
		
		System.out.println("------------------------------");
		
		// 4
		System.out.println("Qual numero vcocê quer saber a tabuada?");
		 int tabu = scanner.nextInt();
		 for(int i = 1; i<=10; i++) {
			 System.out.println(tabu*i);
		 }
		System.out.println("------------------------------");
		
		// 5
		System.out.println("Esses números são divididos por 3");
		for(int cont = 0; cont <= 50; cont+=3) {
					System.out.println(cont);
				}
	
		System.out.println("------------------------------");
		
		// 6
		for(int i = 0; i <= 5; i++) {
			System.out.println("Escolha um numero: ");
			int numero2 = scanner.nextInt();
			int div = numero2 % 2;
			if(div == 0) {
				System.out.println("O numero é par");
			} else {
				System.out.println("O numero é impar");
			}
		}
		
		System.out.println("------------------------------");
		
		// 7
		int soma = 1;
		for(int i = 1; i <= 5; i++) {
			System.out.println("Informe um valor");
			int valor = scanner.nextInt();
			soma = soma * valor;
			System.out.println("A soma é " + soma);
			
		System.out.println("----------------------------------");
			
		}
		// 8
		for (int i = 1; i <= 10; i++) {
            System.out.print("Funcionário " + i + ": Quantos anos você trabalha na empresa? ");
            int anos = scanner.nextInt();

            if (anos >= 10) {
                System.out.println("Parabéns Você irá receber um prêmio");
            } else {
                System.out.println("Quase lá");
            }

            System.out.println();
		}
	}

}

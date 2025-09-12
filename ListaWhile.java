import java.util.Scanner;

public class ListaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1
		int contador = 10;
		while (contador <= 30) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("---------------------------------");

		// 2
		int cont = 1;
		int soma = 0;

		while (cont <= 3) {
			System.out.println("Digite um numero inteiro");
			int num = sc.nextInt();
			soma = soma + num;
			cont++;
			System.out.println("A soma é " + soma);
		}
		System.out.println("---------------------------------");

		// 3
		int cont1 = 1;
		int soma1 = 1;

		while (cont1 <= 5) {
			System.out.println("Digite um numero inteiro");
			int num1 = sc.nextInt();
			soma1 = soma1 * num1;
			cont1++;
			System.out.println("A multiplicação é " + soma1);
		}
		System.out.println("---------------------------------");

		// 4
		System.out.println("Digite um número inteiro: ");
		int num3 = sc.nextInt();
		int contador4 = 1;
		while (contador4 <= num3) {
			System.out.println(contador4 + "");
			contador4++;
		}
		System.out.println("---------------------------------");

		// 5
		int soma5 = 0;
		int contador5 = 1;
		while (contador5 <= 5) {
			soma5 += contador5;
			contador5++;
		}
		System.out.println("Soma de 1 a 5: " + soma5);
		
		// 6
        System.out.print("Digite um número para ver sua tabuada: ");
        int numeroTabuada = sc.nextInt();
        int i6 = 1;
        while (i6 <= 10) {
            System.out.println(numeroTabuada + " x " + i6 + " = " + (numeroTabuada * i6));
            i6++;
        }
	}

}

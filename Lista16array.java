import java.util.Scanner;

public class Lista16array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1
		String[] cor = new String[6];
		for(int i=0; i<cor.length; i++) {
			System.out.print("Cor "+ i+":");
			cor[i] = sc.next();
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("Mostrando as cores no vetor");
		for(int i = 0; i<6; i++) {
			System.out.println("Cor "+i+":"+ cor[i]);
		}
		
		System.out.println("-----------------------------------");
		
		// 2
		double[] valor = new double[8];
		for(int i=0; i<valor.length; i++) {
			System.out.print("Valor "+ i+":");
			valor[i] = sc.nextDouble();
		}
		
		System.out.println("Mostrando o vetor");
		for(int i = 0; i<8; i++) {
			System.out.println("Valor "+i+":"+ valor[i]);
		}
		
		System.out.println("-----------------------------------");
		
		// 3
		int[] num = new int[10];
		for(int i=0; i<num.length; i++) {
			System.out.println("Numero inteiro "+ i+":");
			num[i] = sc.nextInt();
		}
		System.out.println("Números pares são : ");
        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
		}
		
		System.out.println("-----------------------------------");
		
		// 4
		int[] num1 = new int[12];
		for(int i=0; i<num1.length; i++) {
			System.out.println("Numero inteiro "+ i+":");
			num1[i] = sc.nextInt();
			if(num1[i] < 50) {
				System.out.println("O numero é menor que 50");
		}
		}
		
		System.out.println("-----------------------------------");
		
		// 5
		String[] nome = new String[6];
		for(int i=0; i<nome.length; i++) {
			System.out.print("Nome "+ i+":");
			nome[i] = sc.next();
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("Mostrando as cores no vetor");
		for(int i = 0; i<6; i++) {
			System.out.println("Nome "+i+":"+ nome[i]);
		}
		
		System.out.println("-----------------------------------");
		
		// 6
		
		
		
		
		
		// 7
		double[] nota = new double[6];
		for(int i=0; i<nota.length; i++) {
			System.out.println("Qual foi sua nota? "+ i+":");
			nota[i] = sc.nextDouble();
			if(nota[i] > 6 & nota[i] < 7) {
				System.out.println("Aluno em Recuperação!");
		} else if 
			(nota[i] >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
		
		
		// 8
		int[] ing = new int[5];
		for(int i=0; i<ing.length; i++) {
			System.out.println("Qual Valor Do Ingresso "+ i+":");
			ing[i] = sc.nextInt();
			if(ing[i] > 100) {
				System.out.println("Ingresso com promoção disponivel!");
		}
		}
		
		
		
		
		
		
	}

}

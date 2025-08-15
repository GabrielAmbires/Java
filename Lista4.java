import java.util.Scanner;

public class Lista4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		int idade;
		System.out.println("Quantos anos você tem? ");
		idade = scanner.nextInt();
		if(idade >= 18 ) {
		System.out.println("Você tem "+ idade +" anos e é maior de idade");
	    }else {
	    System.out.println("Você tem 1"+ idade +" anos e é menor de idade");
	}	
		//2
		double numero, numero1;
		System.out.println("Me fale 1 numero");
		numero = scanner.nextDouble();
		System.out.println("Me fale outro numero");
		numero1 = scanner.nextDouble();
		if( numero <= numero1) {
		System.out.println("O segundo numero é maior ou eles são iguais");
	    }else {
	    System.out.println("O Primeiro numero é maior");
	    }
		
		//3
		double nota1, nota2;
		System.out.println("Informe a nota 1");
		nota1 = scanner.nextDouble();
		System.out.println("Informe a nota 2");
		nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) /2 ;
		if(media > 7){
		System.out.println("Você foi aprovado sua nota foi "+ media);
	    } else {
		System.out.println("Você foi reprovado sua nota foi "+ media);
	    }
		
		//4
		double num1;
		System.out.println("Me fale um numero ");
		num1 = scanner.nextDouble();
		if(num1 <= 0 ) {
			System.out.println("O número é negativo ou zero");
		}else {
			System.out.println("O numero é possitivo");
		}
		
		//5
		double frete;
		System.out.println("Quantos KM sua entrega esta de você? ");
		frete = scanner.nextDouble();
		double valor1 = frete * 0.5;
		if(frete <= 50) {
		System.out.println("O frete custara R$10.00");
	}else {
		System.out.println("O frete custara R$"+ valor1);
	}
		
		//6
		int dez;
		System.out.println("Me fale um numero ");
		dez = scanner.nextInt();
		if(dez == 10) {
		System.out.println("O numero é 10");
	}else {
		System.out.println("O numero não é 10");
	}
		
		//7
		String yes;
		System.out.println("Você é associado a loja?");
		yes = scanner.next();
		if(yes == "sim") {
			System.out.println("Você nao tem desconto");
		}else {
			System.out.println("Você tem desconto");
		}
		
		//8
		double horas;
		System.out.println("Quanto você fez de horas extras? ");
		horas = scanner.nextDouble();
		double extras = horas * 20;
		double extras2 = horas * 15;
		if(horas <= 10 ) {
			System.out.println("Você recebeu R$"+ extras + " de bonus");
		}else {
			System.out.println("Você recebeu R$15.00 por horas com isso deu R$"+ extras2);
		}
		
		
	}

}

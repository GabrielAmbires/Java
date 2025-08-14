import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		
		int num1;
		int num2;
		System.out.println("Fale 1 numero: ");
		num1 = scanner.nextInt();
		System.out.println("Me fale outro numero: ");
		num2 = scanner.nextInt();
		double soma = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;
		double resto = num1 % num2; //Modulo - Resto da Divisão 
		System.out.println("Soma "+ soma);
		System.out.println("Subtração "+ sub);
		System.out.println("Divisão "+ div);
		System.out.println("Multiplicação "+ mult);
		System.out.println("Resto "+ resto);
		
		//2
		
		double celsius;
		System.out.println("Informe uma temperatura em Celsius para se transformar em fahrenheit");
		celsius = scanner.nextDouble();
		double multi1 = (celsius*1.8) + 35;
		System.out.println("Deu "+ multi1 +" Fahrenheit");
		
		//3
		
		double numero1;
		System.out.println("Me fale um numero em real para transformar em dolar");
		numero1 = scanner.nextDouble();
		double multiplicacao = numero1/5.70 ;
		System.out.println("Deu "+ multiplicacao + " Dolar");
		
		//4
		double base;
		System.out.println("Me fale a base do retangulo");
		base = scanner.nextDouble();
		double altura;
		System.out.println("Me fale a altura do retangulo");
		altura = scanner.nextDouble();
		double area = base * altura;
		System.out.println("A Area deu " + area);
		
		//5
		int idade4;
		System.out.println("Me fale sua idade e irei mostrar quantos mesês você ja viveu ");
		idade4 = scanner.nextInt();
		int meses = idade4 * 12 ;
		System.out.println("Você ja viveu " + meses + " Mesês");
		
		//6
		double tempo;
		System.out.println("Me fale tempo em minutos que eu tranformo em segundo");
		tempo = scanner.nextDouble();
		double minutos = tempo * 60 ;
		System.out.println("Deus " + minutos + " Segundos");
		
		//7
		double preco;
		System.out.println("Quanto foi seu produto? ");
		preco = scanner.nextDouble();
		double quant;
		System.out.println("Quantos produtos você comprou? ");
		quant = scanner.nextDouble();
		double total = preco * quant;
		System.out.println("O total deu " + total);
		
		//8
		double conta;
		System.out.println("Quanto deu a conta? ");
		conta = scanner.nextDouble();
		double pessoas;
		System.out.println("Ira dividir em quantas pessoas? ");
		pessoas = scanner.nextDouble();
		double valor = conta / pessoas;
		System.out.println("Cada pessoa deve pagar " + valor + " Reais");
		
		//9
		double troco;
		System.out.println("Quanto deu a conta? ");
		troco = scanner.nextDouble();
		double conta1;
		System.out.println("Quanto você pagou? ");
		conta1 = scanner.nextDouble();
		double troco1 = conta1 - troco;
		System.out.println("O troco sera de " + troco1 + " Reais");
	}

}

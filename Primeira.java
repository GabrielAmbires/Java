import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Ola Mundo");
		
		//Declaração variavel
		int idade = 16;
		double salario = 2000.50;
		char letra = 'G';
		String nome = "Gabriel";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O salario é: "+ salario + " reais");
		System.out.println("Letra: "+ letra);
		System.out.println("O nome é: " + nome);
		System.out.println(chuva);
		
		//Operadores
		int num1 = 10;
		int num2 = 3;
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
		
		//Entrada de Dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Olá "+ nome1);
		
		//Soma de nois numeros 
		int numero1;
		int numero2;
		System.out.print("Informe um numero: ");
		numero1 = scanner.nextInt();
		System.out.print("Informe outro numero: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: "+soma1);
		
		//Peça o ano de nascimento do usuario e mostre quantos anos ele tem*/
		int nascimento;
		int ano = 2025;
		System.out.println("Qual ano do seu nascimento");
		nascimento = scanner.nextInt();
		int ano1 = ano - nascimento;
		System.out.println("Voce tem: "+ ano1 +" anos");
		
		//Calcular Desconto
		double preco;
		double desconto;
		System.out.println("Qual o valor da compra? ");
		preco = scanner.nextDouble();
		System.out.println("Qual o valor do desconto? ");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.println("Pague: "+ pagar);
		
		/* Peça duas notas decimais para o usuario, calcule média e mostre*/
		double nota;
		double nota1;
		System.out.println("Me fale sua primeira nota em decimal");
		nota = scanner.nextDouble();
		System.out.println("Me fale sua segunda nota em decimal");
		nota1 = scanner.nextDouble();
		double sub1 = (nota + nota1)/2 ;
		System.out.println("Sua média foi: "+ sub1);
		
		
		
		

	}

}

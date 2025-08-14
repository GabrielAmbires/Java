import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		int num1, num2;
		System.out.println("Escreva um numero ");
		num1 = scanner.nextInt();
		System.out.println("Escreva outro numero ");
		num2 = scanner.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma deles deu: "+ soma);
		
		//2
		int num3, num4;
		System.out.println("Escreva um numero ");
		num3 = scanner.nextInt();
		System.out.println("Escreva outro numero ");
		num4 = scanner.nextInt();
		int soma1 = num3 / num4;
		int resto = soma1 % 2;
		System.out.println("A soma deles deu: "+ soma1);
		System.out.println("Resto :"+ resto);
		
		//3
		double lado1, lado2, lado3;
		System.out.println("Me fale o primeiro lado do triangulo");
		lado1 = scanner.nextDouble();
		System.out.println("Fale o segundo lado do triangulo");
		lado2 = scanner.nextDouble();
		System.out.println("Agora o terceiro lado do triangulo");
		lado3 = scanner.nextDouble();
		double perimetro = lado1 + lado2 + lado3;
		System.out.println("O perimetro do triangulo deu "+ perimetro);
		
		//4
		double valor, gorjeta;
		System.out.println("Me fale o valor da conta? ");
		valor = scanner.nextDouble();
		System.out.println("Fale a porcentagem da gorjeta? ");
		gorjeta = scanner.nextDouble();
		double gorjeta1 = (valor * gorjeta) / 100;
		System.out.println("O valor da gorjeta deu "+ gorjeta1 );
		double total = valor + gorjeta1;
		System.out.println("O valor total deu "+ total);
		
		//5
		double pi = 3.14159;
		double raio;
		System.out.println("Me o valor do raio do círculo ");
		raio = scanner.nextDouble();
		double area3 = pi * raio * raio;
		System.out.println("O valor da area do círculo é "+ area3);
		
		//6
		int idade2;
		System.out.println("Informe sua idade");
		idade2 = scanner.nextInt();
		double mes = idade2 * 12;
		System.out.println("Sua idade em meses são "+ mes);
		double dias = idade2 * 365;
		System.out.println("Seus dias vividos são "+ dias);
		double totaldias = (dias * 365) + (mes * 30) + dias;
		System.out.println(+totaldias);
		
		//7
		double horas, pago;
		System.out.println("Quantas horas você trabalha por dia? ");
		horas = scanner.nextDouble();
		System.out.println("Quanto você recebe por horas? ");
		pago = scanner.nextDouble();
		double bruto = horas * pago;
		System.out.println("Seu salario bruto é "+ bruto);
		double imposto = bruto * 0.10;
		System.out.println("O imposto é de "+ imposto);
		double liquido = bruto - imposto;
		System.out.println("O seu salario liquido é de "+ liquido);
		
	}

}

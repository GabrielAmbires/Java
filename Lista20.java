import java.util.Scanner;

public class Lista20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		contagem();
		ret1();
		multiplos();
		cont();
		mes1();
		
		System.out.println("Digite Um Numero");
		int divisivel = sc.nextInt();
		classi(divisivel);
		
		System.out.println("Digite seu nome");
		String nome = sc.next();
		saudacao(nome);
		
		System.out.println("Digite seu nome");
		String nome1 = sc.next();
		System.out.println("Digite seu sobrenome");
		String sobrenome1 = sc.next();
		sobrenome(nome1, sobrenome1);
		
		System.out.println("Digite Um Numero");
		int maiorq = sc.nextInt();
		num(maiorq);
		
		System.out.println("Qual a velocidade?");
		int velocidade = sc.nextInt();
		velo(velocidade);
		
		System.out.println("Qual dia da semana você esta?");
		String semana = sc.next();
		sem(semana);
		
		System.out.println("Quantos Item de estoque você tem?");
		int estoque = sc.nextInt();
		estoq(estoque);
		
	}
	//1
	public static void contagem() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Bom Dia");
		}
		System.out.println("---------------------");
	}
	//2
	public static void ret1() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("*****");
		}
		System.out.println("---------------------");
	}
	//3
	public static void multiplos() {
		for (int i = 5; i <= 25; i+=5) {
			System.out.println(i);
		}
		System.out.println("---------------------");
	}
	//4
	public static void cont() {
		for(int i = 1; i <= 8; i++) {
			System.out.println(i);
			System.out.println("Ponto");
		}
		System.out.println("---------------------");
	}
	//5
	public static void mes1() {
		System.out.println("Janeiro");
		System.out.println("Fevereiro");
		System.out.println("Maeço");
		System.out.println("Abril");
		System.out.println("Maio");
		System.out.println("Junho");
		System.out.println("Julho");
		System.out.println("---------------------");
	}
	//Funçoes Com Parâmetro
	//1
	public static void classi(int divisivel) {
		if(divisivel % 5==0) {
			System.out.println("É Divisivel");
		} else {
			System.out.println("Não é divisivel");
		}
		System.out.println("---------------------");
	}
	//2
	public static void saudacao(String nome) {
		System.out.println("Até Logo, "+nome);
		System.out.println("---------------------");
	}
	//3
	public static void sobrenome(String nome1, String sobrenome1) {
		System.out.println(nome1 + sobrenome1);
	}
	//4
	public static void num(int maiorq) {
		if(maiorq > 100) {
			System.out.println("É maior que 100");
		} else {
			System.out.println("Não é maior que 100");
		}
		System.out.println("---------------------");
	}
	//5
	public static void velo(int velocidade) {
		if(velocidade < 40) {
			System.out.println("Lenta");
		} else if (velocidade > 40 & velocidade < 80){
			System.out.println("Noraml");
		} else {
			System.out.println("Rapida");
		}
		System.out.println("---------------------");
	}
	//6
	public static void sem(String semana) {
		System.out.println("Uma Otima "+semana+"!");
		System.out.println("---------------------");
	}
	//7
	public static void estoq(int estoque) {
		if(estoque >= 10) {
			System.out.println("Estoque Suficiente");
		} else if (estoque >= 5 & estoque < 10){
			System.out.println("Estoque Baixo");
		} else if(estoque < 5) {
			System.out.println("Estoque Critico");
		}
		System.out.println("---------------------");
	}
	
	
	
	
	
	
	
	
}

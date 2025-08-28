import java.util.Scanner;

public class Lista5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 1
		System.out.println("Qual sua idade: ");
		int idade = scanner.nextInt();
		if (idade <= 12) {
			System.out.println("Você é uma criança");
		} else if (idade <= 17) {
			System.out.println("Você é um adolescente");
		} else if (idade <= 59) {
			System.out.println("Você é um adulto");
		} else if (idade >= 60) {
			System.out.println("Você é um idoso");
		}
		// 2
		System.out.println("Digite a temperatura de sua cidade: ");
		int temp = scanner.nextInt();
		if (temp <= 10) {
			System.out.println("Muito Frio");
		} else if (temp <= 20) {
			System.out.println("Frio");
		} else if (temp <= 30) {
			System.out.println("Agradávael");
		} else if (temp >= 30) {
			System.out.println("Muito Quente");
		}
		// 3
		System.out.println("Digite sua nota: ");
		int nota = scanner.nextInt();
		if (nota >= 90) {
			System.out.println("A");
		} else if (nota >= 80) {
			System.out.println("B");
		} else if (nota >= 70) {
			System.out.println("C");
		} else if (nota >= 60) {
			System.out.println("D");
		} else if (nota <= 60) {
			System.out.println("F");
		}
		// 4
		System.out.print("Digite sua senha:");
		String senha = scanner.next();
		if (senha.equalsIgnoreCase("admin")) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
		// 5
		System.out.print("Digite o primeiro nome: ");
		scanner.nextLine();
		String nom = scanner.nextLine();

		System.out.print("Digite o segundo nome: ");
		String nome1 = scanner.nextLine();

		if (nom.equalsIgnoreCase(nom) == nome1.equalsIgnoreCase(nom)) {
			System.out.println("Os nomes são iguais.");
		} else {
			System.out.println("Os nomes são diferentes.");
		}
		// 6
		System.out.println("Tente advinhar a cor!");
		String cor = scanner.next();
		if (cor.equalsIgnoreCase("azul")) {
			System.out.println("Boa escolha!");
		} else if (cor.equalsIgnoreCase("vermelho")) {
			System.out.println("Cor vibrante");
		} else if (cor.equalsIgnoreCase("verde")) {
			System.out.println("Cor da natureza");
		} else {
			System.out.println("Cor não cadastrada");
		}
		// 7
		System.out.println("Me fale uma letra");
		String letra = scanner.next();

		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
				|| letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
			System.out.println("Volgal");
		} else {
			System.out.println("Consoante");
		}
	}

}

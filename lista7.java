import java.util.Scanner;

public class lista7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1
		int numero;
		System.out.println("Informe sua idade: ");
		numero = scanner.nextInt();

		if (numero <= 16 || numero >= 70) {
			System.out.println("Classificação Especial");
		} else {
			System.out.println("Classificação regular");
		}

		// 2
		System.out.println("Qual valor do seu produto? ");
		double produto = scanner.nextDouble();
		System.out.println("Quantos produtos você comprou? ");
		int quantidade = scanner.nextInt();
		double valor1 = produto * quantidade;
		double desc = valor1 * 0.15;
		double valorf = valor1 - desc;
		if (valor1 > 200 && quantidade > 5) {
			System.out.printf("Você recebeu desconto e ira pagar: R$ %.2f", valorf);
		} else {
			System.out.println("Não recebeu desconto");
		}

		// 3
		System.out.println("Qual sua frequência cardíaca em bpm? ");
		int bat = scanner.nextInt();
		System.out.println("Você sente tontura? ");
		String tont = scanner.next();

		if (bat > 100 || tont.equalsIgnoreCase("sim")) {
			System.out.println("Procure atendimento médico");
		} else {
			System.out.println("Sem sinais de alerta");
		}

		// 4
		System.out.println("Qual Sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Você é residente do estado? ");
		String est = scanner.next();
		System.out.println("");

		if (idade >= 18 && idade <= 30 && est.equalsIgnoreCase("Sim")) {
			System.out.println("Elegível para o concurso");
		} else {
			System.out.println("Não elegível para o concurso");
		}

		// 5
		System.out.println("Quantos projetos concluidos você teve? ");
		int proj = scanner.nextInt();
		System.out.println("Quantos erros reportados? ");
		int erros = scanner.nextInt();

		if (proj > 10 && erros < 3) {
			System.out.println("Recompensa Concedida");
		} else {
			System.out.println("Sem recompensa");
		}

		// 6
		System.out.println("Qual sua idade? ");
		int idd = scanner.nextInt();
		System.out.println("Você possui passaporte? ");
		String pas = scanner.next();

		if (idd >= 18 && pas.equalsIgnoreCase("sim")) {
			System.out.println("Viagem autorizada");
		} else {
			System.out.println("Viagem não autorizada");
		}

		// 7
		System.out.println("Me fale sua nota final de (0 a 100)");
		int nota = scanner.nextInt();
		System.out.println("Me fala quantas aulas você assistiu de (0 a 50)");
		int freq = scanner.nextInt();

		if (nota >= 70 && freq >= 40) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		//8
		System.out.println("Informe a umidado do solo ");
		int umi = scanner.nextInt();
		System.out.println("Qual a temperatura ?");
		int temp = scanner.nextInt();
		
		if(umi < 30 || temp > 30) {
			System.out.println("Irrigação necessária");
		}else {
			System.out.println("Irrigação não necessária");
		}
		
		//9
		System.out.println("Informe sua idade");
		int idd1 = scanner.nextInt();
		System.out.println("Possui experiencia? ");
		String exp2 = scanner.next();
		
		if(idd1 >= 20 && idd1 <= 40 && exp2.equalsIgnoreCase("sim")) {
			System.out.println("Inscrição aceita");
		}else {
			System.out.println("Inscrição não permitida");
		}
		
	}
}

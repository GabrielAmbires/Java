import java.util.Scanner;

public class Lista6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		
		System.out.println("Informe um numero");
		double num = scanner.nextDouble();
		if(num 	>=10 && num <20){
		System.out.println("O numeor esta no intervalo ");
		}else {
			System.out.println("O numero esta fora do intervalo");
		}
		
		//2
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Voce tem o convite? (true/false) ");
		boolean ingresso = scanner.nextBoolean();
		
		if(idade >= 18 && ingresso) {
			System.out.println("Entrada Permitida");
		}else {
			System.out.println("Enrada Negada");
		}
		
		//3
		System.out.println("Informe sua idade");
		double idd = scanner.nextDouble();
		if(idd 	<=12 && idd >60){
		System.out.println("Categoria Especial ");
		}else {
		System.out.println("Categoria Normal");
		}
		
		//4
		System.out.println("Quanto deu seu produto? ");
		double val = scanner.nextDouble();
		System.out.println("O pagamento sera Avista ou Cartão ?");
		String pag = scanner.next();
		double valor = (val * 0.10);
		double desc = val - valor;
		
		if(val > 100 && pag.equalsIgnoreCase("Avista")) {
		System.out.printf("O produto sera R$ %.2f", desc);
		}else {
			System.out.println("Não tera Desconto");
		}
		
		//5
		System.out.println("Qual sua temperatura? ");
		double temp = scanner.nextDouble();
		System.out.println("O Você tem sintomas? (True/False)");
	    boolean sint = scanner.nextBoolean();
		
		if(temp >= 38 || sint ) {
		System.out.printf("Recomenda-se procurar um médico");
		}else {
			System.out.println("Sem sinais Preucupante");
		}
		
		//6
		System.out.println("Quantos anos você tem? ");
		int anos = scanner.nextInt();
		System.out.println("Você é brasileiro? (True/False)");
	    boolean bra = scanner.nextBoolean();
		
		if(anos >= 16 && bra ) {
		System.out.printf("Você pode votar");
		}else {
			System.out.println("Não pode votar");
		}
		
		//7
		System.out.println("Quantas horas extras você fez? ");
		int horas = scanner.nextInt();
		System.out.println("Quantas faltes você tem? ");
	    int fal = scanner.nextInt();
		
		if(horas > 20 && fal < 5 ) {
		System.out.printf("Você Ganhou bonus");
		}else {
			System.out.println("Não ganhou bonus");
		}
		
		//8
		System.out.println("Quantos anos você tem? ");
		int car = scanner.nextInt();
		System.out.println("Você tem carteira? (True/False)");
	    boolean teira = scanner.nextBoolean();
		
		if(anos >= 18 && teira ) {
		System.out.printf("Você pode dirigir");
		}else {
			System.out.println("Não pode dirigir");
		}
		
		//9
		System.out.println("Qual sua nota média (0 a 10)? ");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua requência? (0 a 100)");
		int frequencia = scanner.nextInt();
		if(nota >= 8 || frequencia >= 80) {
			System.out.println("Bolsa concedida");
		}else {
			System.out.println("Bolsa não concedida");
		}
		
		//10
		System.out.println("Qual a temperatura?");
		int clima = scanner.nextInt();
		System.out.println("Qual a porcentagem de umidade?");
		int tizacao = scanner.nextInt();
		if(clima < 18 || clima  > 26 && tizacao > 60) {
			System.out.println("Ajustar climatização");
		}else {
			System.out.println("Climatização não necessária");
		}
	}

}

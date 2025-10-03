
public class lista18 {

	public static void main(String[] args) {
		nome();
		motivacional();
		contagem();
		vogais();
		quadrado();
		pares();
		reg();
		triangulo();
		semana();
	}

	// 1
	public static void nome() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Gabriel Ambires");
		}
		System.out.println("--------------------------------");
	}

	// 2
	public static void motivacional() {
		System.out.println("A obsessão ganha do talento todas as vezes");
		System.out.println("--------------------------------");
	}

	// 3
	public static void contagem() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------------------");
	}

	// 4
	public static void vogais() {
		System.out.println("A - E - I - O - U");
		System.out.println("--------------------------------");
	}
	//5
	public static void quadrado() {
		System.out.println("|**|");
		System.out.println("|**|");
		System.out.println("--------------------------------");
}

	// 6
	public static void pares() {
		for (int i = 0; i <= 20; i += 2) {
			System.out.println(i);
		}
		System.out.println("--------------------------------");
	}

	// 7
	public static void reg() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Fim!");
		System.out.println("--------------------------------");
	}

	// 8
	public static void triangulo() {
				System.out.println(" *");
				System.out.println(" **");
				System.out.println(" ***");
				System.out.println(" ****");
				System.out.println(" *****");
	}
	{
					System.out.println("--------------------------------");
			}
				
	// 9
	public static void semana() {
		System.out.println("Domingo");
		System.out.println("Segunda");
		System.out.println("Terça");
		System.out.println("Quarta");
		System.out.println("Quinta");
		System.out.println("Sexta");
		System.out.println("Sabado");
		{
			System.out.println("--------------------------------");
		}

	}
}

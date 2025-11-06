import java.util.Scanner;

public class FilmeP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Filme fm = new Filme();
		
		System.out.println("Qual O Titulo Do Filme?");
		fm.titulo = sc.next();

		System.out.println("Qual O Genero Do Filme?");
		fm.genero = sc.next();
		
		System.out.println("Qual A Duração Do Filme?");
		fm.duracao = sc.nextDouble();
		
		fm.assistir();
		
		fm.mostrarInformacoes();
	}

}

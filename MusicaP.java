import java.util.Scanner;

public class MusicaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Musica msc = new Musica();
		
		System.out.println("Qual O Artista Escolhido?");
		msc.artista = sc.next();
		
		System.out.println("----------------------------------");
		
		System.out.println("Qual Musica Escolhida");
		msc.titulo = sc.next();
		
		System.out.println("----------------------------------");
		
		System.out.println("Qual Duração Da Musica Em Minutos");
		msc.duracao = sc.nextDouble();
		
		msc.tocar();
		
		msc.pausar();
		
		msc.mostrarDetalhes();
	}

}

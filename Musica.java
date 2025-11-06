
public class Musica {
	String titulo;
	String artista;
	double duracao;
	
	void tocar() {
		System.out.println("Tocando "+ titulo+ " De " +artista);
	}
	void pausar() {
		System.out.println("Musica Pausada");
	}
	void mostrarDetalhes() {
		System.out.println("Nome Da Musica "+titulo+", Do Artista "+artista+" Com "+ duracao +" Minutos De Duração");
	}
}

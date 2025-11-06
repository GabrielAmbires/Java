
public class Filme {
	String titulo;
	String genero;
	double duracao;
	
	void assistir() {
		System.out.println("Assistindo "+titulo);
	}
	void mostrarInformacoes() {
		System.out.println("Titulo "+titulo+", Genero "+genero+" Duração "+duracao);
	}
}

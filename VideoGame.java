
public class VideoGame {
	String marca;
	String modelo;
	boolean ligado;
	
	void ligar() {
		ligado = true;
		System.out.println("Video Game Ligado");
	}
	void deligar() {
		ligado = false;
		System.out.println("Video Game Desligado");
	}
	void verificarStatus() {
		if(ligado) {
			System.out.println("O Videos Game Está Ligado");
		} else {
			System.out.println("O Video Game Está Desligado");
		}
	}
}

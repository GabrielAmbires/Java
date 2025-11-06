
public class Gato {
	String nome;
	int idade;
	String raca;
	
	void miar() {
		System.out.println("Miau!");
	}
	void comer() {
		System.out.println(nome+", está comendo");
	}
	void mostrarInformacoes() {
		System.out.println(nome+","+raca+","+idade);
	}
}


public class Pizza {
	String sabor;
	String tamanho;
	boolean bordaRecheada;

	void preparar() {
		System.out.println("Preparando a Pizza do Sabor: " + sabor);
	}

	void assando() {
		System.out.println("Assando Pizza Tamanho: " + tamanho);
	}

	void mostrarInformacoes() {
		if(bordaRecheada) {
			System.out.println("Sabor " + sabor + ", Tamanho " + tamanho+", Com Borda Recheada");	
		} else {
			System.out.println("Sabor " + sabor + ", Tamanho " + tamanho+", Sem Borda Recheada");
		}
	}
}

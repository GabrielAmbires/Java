package lista;

public class Carro {
	private String modelo;
	private int ano;
	private int velocidadeAtual = 0;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void acelerar(int valor) {
		velocidadeAtual += valor;
	}

	public void Freiar(int valor) {

		if (valor <= 0) {
			System.out.println("Valor inválido");
		} else {
			velocidadeAtual -= valor;
		}

	}
}

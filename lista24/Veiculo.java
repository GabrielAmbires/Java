package lista24;

public class Veiculo {
	private String marca;
	private int ano;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void exibirInfo() {
		System.out.println("Carro: " + marca + " Ano: " + ano);
	}
}

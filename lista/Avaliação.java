package lista;

public class Avaliação {
	private String nome;
	private double nota1;
	private double nota2;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if ( nota1 > 10 || nota1 < 0) {
			System.out.println("Nota Invalida");
		} else {
			this.nota1 = nota1;
		}
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		if ( nota2 > 10 || nota2 < 0) {
			System.out.println("Nota Invalida");
		} else {
			this.nota2 = nota2;
		}
	}
}

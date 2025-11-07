package lista24;

public class Funcionario {
	private String nome;
	private double salarioBase;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public void salarioBase() {
		System.out.println(salarioBase);
	}
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salarioBase);
	}
}

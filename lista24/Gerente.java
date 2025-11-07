package lista24;

public class Gerente extends Funcionario {
	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void gerenciar() {
		System.out.println("O "+ getNome() + " Gerencia o Departamento: " + departamento);
	}
	public double calcularSalario() {
		return 1.20 * getSalarioBase();
	}
	
}

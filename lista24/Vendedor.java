package lista24;

public class Vendedor extends Funcionario{
	int comissao = 500;
	
	public void vender() {
		System.out.println("O Vendedor: " + getNome() + "está recebendo R$ 500.00 de Comissão");
	}
	public double calcularSalario() {
		return comissao + getSalarioBase();
	}
}


public class ContaBancaria {
	String titular;
	double saldo;
	double depositar;
	double sacar;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		} else {
			System.out.println("Valor Inválido");
		}
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
		} else {
			System.out.println("Saldo Insuficiente!");
		}
	}
}

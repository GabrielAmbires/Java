import java.util.Scanner;

public class ContaBancariaP {
	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual Seu Nome?");
		conta.titular = sc.next();
		
		System.out.println("Saldo: " + conta.getSaldo());
		conta.sacar(200);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.sacar(400);
		System.out.println("Saldo: " + conta.getSaldo());

	}

}

package lista;

import java.util.Scanner;

public class CarroP {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o modelo do carro: ");
		String modelo = sc.next();
		System.out.println("Digite o ano do carro: ");
		int ano = sc.nextInt();
		System.out.println("Digite a velocidade atual: ");
		int velocidadeAtual = sc.nextInt();
		System.out.println("Digite a aceleração ");
		int acelerarr = sc.nextInt();
		System.out.println("Digite o quanto quer freiar ");
		int freiar = sc.nextInt();

		carro.setModelo(modelo);
		carro.setAno(ano);
		carro.setVelocidadeAtual(velocidadeAtual);
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		System.out.println("Velocidade: " + carro.getVelocidadeAtual());
		carro.acelerar(acelerarr);
		System.out.println(carro.getVelocidadeAtual());

		System.out.println("Freio: " + carro.getVelocidadeAtual());
		carro.Freiar(freiar);
		System.out.println(carro.getVelocidadeAtual());

	}
}
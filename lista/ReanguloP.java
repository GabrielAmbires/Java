package lista;

import java.util.Scanner;
public class ReanguloP {

	public static void main(String[] args) {
		Retangulo ret = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		double largura, altura;
		System.out.println("Qual a largura? ");
		largura = sc.nextDouble();
		System.out.println("Qual a altura? ");
		altura = sc.nextDouble();
		ret.setAltura(altura);
		ret.setLargura(largura);
		System.out.println(ret.calcularArea());
		System.out.println(ret.calcularPerimetro());
	}

}

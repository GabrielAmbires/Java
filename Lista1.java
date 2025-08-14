
public class Lista1 {

	public static void main(String[] args) {
		
				//1
		        double inst = 300;
		        double limp = 150;
		        double manut = 499.99;
		        double total = inst + limp + manut;
		        System.out.println("1 - Total a pagar pelos serviços: R$" + total);

		        //2
		        double salario = 35;
		        int horas = 8;
		        double salariodia = salario * horas;
		        System.out.println("2 - Salário por dia do Joaquim: " + salariodia);

		        //3
		        int bombonsPorCaixa = 27;
		        int caixasCompradas = 16;
		        int totalBombons = bombonsPorCaixa * caixasCompradas;
		        System.out.println("3 - Total de bombons comprados: " + totalBombons + " unidades");

		        //4
		        int garrafasVendidas = 300;
		        int garrafasPorCaixa = 20;
		        int caixasUsadas = garrafasVendidas / garrafasPorCaixa;
		        System.out.println("4 - Caixas de garrafas utilizadas: " + caixasUsadas + " caixas");

		        //5
		        int compradas = 120;
		        int vendidas = 80;
		        int compradas1 = 50;
		        int estoque = (compradas - vendidas) + compradas1;
		        double preco = 30;
		        double faturamento = vendidas * preco;
		        System.out.println("5 - Camisetas em estoque: " + estoque);
		        System.out.println("5 - Faturamento: " + faturamento);

		        //6
		        int numero = 40;
		        int dobro = numero * 2;
		        double metade = numero / 2;
		        System.out.println("Dobro do número: " + dobro);
		        System.out.println("Metade do número: " + metade);
		        
	}
}

import java.util.Scanner;

public class Listaa19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para classificar: ");
        int num1 = sc.nextInt();
        classificarnum(num1);

        System.out.println("Digite uma idade: ");
        int idade = sc.nextInt();
        maioridade(idade);

        System.out.println("Digite seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        saudacao(nome);

        System.out.println("Digite um número para ver a tabuada: ");
        int tabuadaNum = sc.nextInt();
        tabuada(tabuadaNum);

        System.out.println("Digite a primeira palavra: ");
        sc.nextLine();
        String palavra1 = sc.nextLine();
        System.out.println("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();
        palavras(palavra1, palavra2);

        System.out.println("Digite um número para verificar se é par ou ímpar: ");
        int numParImpar = sc.nextInt();
        parouimpar(numParImpar);

        System.out.println("Digite a temperatura: ");
        double temperatura = sc.nextDouble();
        temp(temperatura);

        System.out.println("Digite o turno (manhã, tarde ou noite): ");
        sc.nextLine();
        String turno = sc.nextLine();
        saudacaoPorTurno(turno);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        media(nota1, nota2, nota3);

        System.out.println("Digite a nota final do aluno: ");
        double notaf = sc.nextDouble();
        aprovacao(notaf);

    }
    
    // 1
    public static void classificarnum(int numero) {
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }

    // 2
    public static void maioridade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    // 3
    public static void saudacao(String nome) {
        System.out.println("Olá " + nome + ", seja bem-vindo!");
    }

    // 4
    public static void tabuada(int numero) {
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // 5
    public static void palavras(String palavra1, String palavra2) {
        System.out.println("Palavras concatenadas: " + palavra1 + " " + palavra2);
    }

    // 6
    public static void parouimpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }

    // 7
    public static void temp(double temperatura) {
        if (temperatura < 15) {
            System.out.println("Frio");
        } else if (temperatura <= 25) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }
    }

    // 8
    public static void saudacaoPorTurno(String turno) {
        switch (turno.toLowerCase()) {
            case "manhã":
                System.out.println("Bom dia!");
                break;
            case "tarde":
                System.out.println("Boa tarde!");
                break;
            case "noite":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Turno inválido");
        }
    }

    // 9
    public static void media(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);
    }

    // 10
    public static void aprovacao(double notaf) {
        if (notaf >= 7) {
            System.out.println("Aprovado");
        } else if (notaf >= 5) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}

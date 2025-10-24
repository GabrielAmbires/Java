import java.util.Scanner;

public class Lista21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.println("ME FALE 2 NUMEROS QUE IRIA FAZER A SOMA");
        System.out.println("Me o 1° Numero");
        int numero1 = sc.nextInt();
        System.out.println("Me o 2° Numero");
        int numero2 = sc.nextInt();
        int numtotal = soma(numero1, numero2);
        System.out.println("A soma é " + numtotal);
        System.out.println("-------------");

        // 2
        System.out.println("ME FALE 2 NUMEROS QUE IRIA FAZER A DIFERENÇA ENTRE ELES");
        System.out.println("Me o 1° Numero");
        int num1 = sc.nextInt();
        System.out.println("Me o 2° Numero");
        int num2 = sc.nextInt();
        int numetotal = dif(num1, num2);
        System.out.println("A diferença é " + numetotal);
        System.out.println("-------------");

        // 3
        System.out.println("ME FALE 2 NUMEROS QUE IRIA FAZER A MULTIPLICAÇÃO");
        System.out.println("Me o 1° Numero");
        int nume1 = sc.nextInt();
        System.out.println("Me o 2° Numero");
        int nume2 = sc.nextInt();
        int multtotal = multp(nume1, nume2);
        System.out.println("A multiplicação é " + multtotal);
        System.out.println("-------------");

        // 4
        System.out.println("ME FALE 2 NUMEROS QUE IRIA FAZER A DIVISÃO");
        System.out.println("Me o 1° Numero");
        int numer1 = sc.nextInt();
        System.out.println("Me o 2° Numero");
        int numer2 = sc.nextInt();
        int divtotal = div(numer1, numer2);
        System.out.println("A divisão é " + divtotal);
        System.out.println("-------------");

        // 5
        System.out.println("ME FALE 2 NUMEROS QUE IRIA FAZER A MÉDIA");
        System.out.println("Me o 1° Numero");
        int nota1 = sc.nextInt();
        System.out.println("Me o 2° Numero");
        int nota2 = sc.nextInt();
        int medtotal = calmedia(nota1, nota2);
        System.out.println("A média é " + medtotal / 2);
        System.out.println("-------------");

        // 6
        System.out.println("ME FALE SUAS 2 NOTAS PARA VERIFICAR SE FOI APROVADO OU REPROVADO");
        System.out.println("Qual foi sua 1° nota?");
        int notas1 = sc.nextInt();
        System.out.println("Qual foi sua 2° nota?");
        int notas2 = sc.nextInt();
        String resultado = aprovacao(notas1, notas2);
        System.out.println("Resultado: " + resultado);
        System.out.println("-------------");

        // 7
        System.out.println("DIGITE 2 NÚMEROS PARA SABER QUAL É O MAIOR");
        System.out.println("Primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Segundo número:");
        int n2 = sc.nextInt();
        int maior = maiorNumero(n1, n2);
        if (maior == 0) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("O maior número é: " + maior);
        }
        System.out.println("-------------");

        // 8
        System.out.println("DIGITE UMA TEMPERATURA EM CELSIUS PARA CONVERTER EM FAHRENHEIT");
        double celsius = sc.nextDouble();
        double fahrenheit = converter(celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("-------------");

        // 9
        System.out.println("CALCULAR A ÁREA DE UM RETÂNGULO");
        System.out.println("Informe a base:");
        double base = sc.nextDouble();
        System.out.println("Informe a altura:");
        double altura = sc.nextDouble();
        double area = calc(base, altura);
        System.out.println("A área do retângulo é: " + area);
        System.out.println("-------------");

        // 10
        System.out.println("DIGITE SEU NOME PARA RECEBER UMA MENSAGEM");
        sc.nextLine();
        String nome = sc.nextLine();
        String mensagem = mensagem(nome);
        System.out.println(mensagem);
        System.out.println("-------------");

        // 11
        System.out.println("DIGITE DOIS NOMES PARA JUNTAR");
        System.out.println("Primeiro nome:");
        String nome1 = sc.nextLine();
        System.out.println("Segundo nome:");
        String nome2 = sc.nextLine();
        String nomeCompleto = nomes(nome1, nome2);
        System.out.println("Nomes juntos: " + nomeCompleto);
        System.out.println("-------------");

        // 12
        System.out.println("INFORME SUA IDADE PARA SABER SUA CATEGORIA");
        int idade = sc.nextInt();
        String categoria = avaliarIdade(idade);
        System.out.println("Você é: " + categoria);

        sc.close();
    }

    // 1
    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // 2
    public static int dif(int num1, int num2) {
        return num1 - num2;
    }

    // 3
    public static int multp(int nume1, int nume2) {
        return nume1 * nume2;
    }

    // 4
    public static int div(int numer1, int numer2) {
        return numer1 / numer2;
    }

    // 5
    public static int calmedia(int nota1, int nota2) {
        return nota1 + nota2;
    }

    // 6
    public static String aprovacao(int nota1, int nota2) {
        int media = (nota1 + nota2) / 2;
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // 7
    public static int maiorNumero(int n1, int n2) {
        if (n1 == n2) {
            return 0;
        } else if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    // 8
    public static double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 9
    public static double calc(double base, double altura) {
        return base * altura;
    }

    // 10
    public static String mensagem(String nome) {
        return "Olá, " + nome + "!";
    }

    // 11
    public static String nomes(String nome1, String nome2) {
        return nome1 + " " + nome2;
    }

    // 12
    public static String avaliarIdade(int idade) {
        if (idade < 12) {
            return "Criança";
        } else if (idade < 18) {
            return "Adolescente";
        } else if (idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}

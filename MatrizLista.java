import java.util.Scanner;

public class MatrizLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        int[][] matriz1 = new int[2][3];
        System.out.println("Preencha com valores inteiros :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println(" Matriz completa:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }

        // 2
        sc.nextLine();
        String[][] nomes = new String[3][2];
        System.out.println("Preencha com os nomes :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Nome [" + i + "][" + j + "]: ");
                nomes[i][j] = sc.nextLine();
            }
        }

        System.out.println(" Tabela de nomes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(nomes[i][j] + "\t");
            }
            System.out.println();
        }

        // 3
        int[][] matriz3 = new int[3][3];
        System.out.println(" Preencha a matriz com numeros inteiros :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz3[i][j] = sc.nextInt();
            }
        }

        System.out.println(" Matriz Nomes:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento [" + i + "][" + i + "] = " + matriz3[i][i]);
        }

        // 4
        int[][] matriz4 = new int[3][3];
        boolean encontrado = false;
        System.out.println(" Preencha a matriz :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz4[i][j] = sc.nextInt();
            }
        }

        System.out.print(" Digite o número a procurar: ");
        int numero = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz4[i][j] == numero) {
                    System.out.println("Número encontrado na posição [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (encontrado) {
            System.out.println("Número não encontrado.");
        }

        // 5
        int[][] matriz5 = new int[4][3];
        System.out.println(" Preencha a matriz 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz5[i][j] = sc.nextInt();
            }
        }

        System.out.println(" Numeros maiores que 10:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz5[i][j] > 10) {
                    System.out.println("Elemento [" + i + "][" + j + "] = " + matriz5[i][j]);
                }
            }
        }
    }
}

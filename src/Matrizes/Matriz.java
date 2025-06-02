package Matrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("quantas linhas ?");
        int l = scanner.nextInt();

        System.out.println("quantas colunas?");
        int c = scanner.nextInt();

        int [][] matriz = new int[l][c];

        for (int i = 0 ; i < l; i++){
            for (int j = 0; j < c; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0 ; i < l; i++){
            for (int j = 0; j < c; j++){
               System.out.print(matriz[i][i]);
                System.out.println(matriz[j][j]);
            }
        }


        scanner.close();
    }
}

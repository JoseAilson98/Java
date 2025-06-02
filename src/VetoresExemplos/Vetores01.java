package VetoresExemplos;

import java.util.Locale;
import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {

        /* Fazer um programa para ler um número inteiro N e altura de N
            pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar
            a altura média dessas pessoas.
         */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double [] vetor = new double[n];

        // preenchendo o vetor...
        for (int i = 0; i <vetor.length; i++){
            vetor [i] = scanner.nextDouble();
        }

        //somando os valores do vetor....
        double soma = 0.0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }

        double media = soma / vetor.length;
        System.out.printf("Media é %.2f%n",soma);


        scanner.close();
    }
}

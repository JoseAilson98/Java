package CriandoFuncoesPersonalizado;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        //programa para descobrir o maior numero digitado.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros.");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int valor = maior(a,b,c); // processando
        mostrarResultado(valor); // imprimindo na tela


        sc.close();
    }
    // criando função para mostrar o maior numero digitado
    public static int maior(int x, int y, int z){
        int aux;

        if( x > y && x > z){
            aux = x;
        } else if(y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    // criando a função para imprimir na tela.
    public static void mostrarResultado(int i){
        System.out.println("Maior é: "+i);
    }
}

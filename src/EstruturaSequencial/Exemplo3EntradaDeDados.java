package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo3EntradaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // para usar Ponto
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();
        sc.nextLine(); // pq vou usar texto na proxima entrada

        System.out.println("Digite um texto: ");
        String text = sc.nextLine();

        System.out.println("Digite um caractere");
        char x = sc.next().charAt(0);


        System.out.println("voce digitou: "+numero);
        System.out.println("voce digitou: "+text);
        System.out.println("voce digitou: "+x);

        sc.close();
    }
}

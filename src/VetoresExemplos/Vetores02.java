package VetoresExemplos;

import java.util.Locale;
import java.util.Scanner;

public class Vetores02 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product [] products = new Product[n];

        for(int i = 0; i < products.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();

            products [i] = new Product(nome,preco);

        }

        double somaPreco = 0.0;

        for (int i = 0; i < products.length; i++){
            somaPreco += products[i].getPreco();
        }

        double mediaPreco = somaPreco / products.length;
        System.out.printf("Preço medio dos produtos é %.2f%n",mediaPreco);



        sc.close();


    }
}

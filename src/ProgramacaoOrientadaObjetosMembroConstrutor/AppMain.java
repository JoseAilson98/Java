package ProgramacaoOrientadaObjetosMembroConstrutor;

import java.util.Locale;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in Stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name,price,quantity);


        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Updated data: "+product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("Updated data: "+product);










        sc.close();


    }
}

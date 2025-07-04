package ProgramacaoOrientadaObjetos.programa1;

import ProgramacaoOrientadaObjetos.programa1.entity.Product;

import java.util.Locale;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Updated data: "+product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("Updated data: "+product);







        sc.close();


    }
}

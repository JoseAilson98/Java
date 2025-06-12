package comparator;

import comparator.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV",1500.0));
        products.add(new Product("Computador",2600.0));
        products.add(new Product("Notebook",5000.0));

        products.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        // sort = ordenação, critério foi por nome.

        for(Product p : products){
            System.out.println("Nome: "+p.getName()+", Preço: "+p.getPrice());
        }
    }
}

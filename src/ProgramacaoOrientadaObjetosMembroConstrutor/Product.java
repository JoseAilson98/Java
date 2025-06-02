package ProgramacaoOrientadaObjetosMembroConstrutor;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    public double TotalValuenInStock(){
         return quantity * price;
    }

    public void AddProducts (int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name+", "+
                "$ "+price+", "+
                quantity+" unity,"
                +" Total: "+TotalValuenInStock();
    }
}

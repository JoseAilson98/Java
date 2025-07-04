package ProgramacaoOrientadaObjetosEncapsulamento;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }




    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

package ProgramacaoOrientadaObjetos.programa1.entity;

public class Product {

    public String name;
    public double price;
    public int quantity;


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

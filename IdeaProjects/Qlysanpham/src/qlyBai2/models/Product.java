package qlyBai2.models;

public class Product {
     int product_id;
     String name;
     double price;
     int quantity;


    public Product(int product_id, String name, double price, int quantity) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Product" +
                "\nid: " + product_id +
                "\nname: " + name +
                "\nprice: " + price +
                "\nquantity: " + quantity
                ;
    }
}
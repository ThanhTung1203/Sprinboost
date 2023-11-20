package qlyBai2.models;

import java.util.Date;

public class Invoice {
    String customer_name;
    String product;
    int quantity;
    Date timestamp;

    public Invoice(String customer_name, String product, int quantity, Date timestamp) {
        this.customer_name = customer_name;
        this.product = product;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }
}

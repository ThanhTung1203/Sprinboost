package qlyBai2.models;

import bai2.Library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {
    public List<Product> products = new ArrayList<>();
    public List<Invoice> invoices = new ArrayList<>();

    public Store() {
        products.add(new Product(1, "chuối", 20.5, 40));
        products.add(new Product(2, "đào", 40, 20));
        products.add(new Product(3, "lê", 28, 30));
        products.add(new Product(4, "táo", 25, 60));
        products.add(new Product(5, "ổi", 30, 80));

    }

    public void showListProduct() {
        for (Product product : products
        ) {
            System.out.println(product.product_id + ". " +
                    product.name + " - " +
                    product.price + "$ - " +
                    product.quantity

            );
        }
    }

    public void showListInvoice() {
        for (Invoice invoice : invoices) {
            System.out.println("Time: " + invoice.timestamp +
                    "\nCustomer: " + invoice.customer_name +
                    "\nMặt hàng: " + invoice.product +
                    "\nQuantity: " + invoice.quantity);
        }
    }

    public void productAvaiable() {

        System.out.println(" các sản phẩm còn hàng ");
        for (Product b : products
        ) {
            if (b.quantity > 0) {
                System.out.println(b.product_id +
                        ". " + b.name + " - " +
                        b.price + "$ - Quantity: " +
                        b.quantity);
                ;
            }

        }
    }


    public void buyProduct(int productID, int quantity, String customerName) {
        Product product = null;
        for (Product p : products) {
            if (p.product_id == productID) {
                product = p;
                break;
            }
        }
        if (product != null && product.quantity >= quantity) {
            product.quantity -= quantity;
            Invoice invoice = new Invoice(customerName, product.name, quantity, new Date());
            invoices.add(invoice);
            System.out.println("Đã mua hàng: " + quantity +
                    " " + product.name +
                    " đã mua bởi " + customerName);
        } else if (product != null && product.quantity < quantity) {
            System.out.println("Sản phẩm '" + product.name +
                    "' chỉ còn " + product.quantity +
                    " trong kho. Vui lòng giảm số lượng.");
        } else {
            System.out.println("Không tìm thấy sản phẩm hoặc số lượng không hợp lệ.");
        }
        }

    public Product findProductById(int productId) {
        for (Product product : products) {
            if (product.product_id == productId) {
                return product;
            }
        }
        return null;

    }





}


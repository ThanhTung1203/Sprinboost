package qlyBai2.controller;

import qlyBai2.models.Product;
import qlyBai2.models.Store;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Menu : ");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Tìm kiếm sản phẩm theo tên");
            System.out.println("3. Xem sản phẩm còn hàng ");
            System.out.println("4. Mua hàng");
            System.out.println("5. Xem danh sách đơn hàng");
            System.out.println("6. Thoát");
            System.out.println("chọn tình năng : ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    store.showListProduct();
                    break;
                case 2:
                    System.out.println(" nhập id sản phẩm cần tìm");
                    int findbyId= scanner.nextInt();
                    System.out.println(store.findProductById(findbyId));
                    break;
                case 3:
                    store.productAvaiable();
                    break;
                case 4:
                    System.out.println("Nhập Id: ");
                    int productID = scanner.nextInt();
                    System.out.println("Nhập số lượng cần mua: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên khách hàng: ");
                    String customerName = scanner.nextLine();
                    store.buyProduct(productID, quantity, customerName);
                    break;
                case 5:
                    store.showListInvoice();
                    break;
                case 6:
                    System.out.println(" cảm ơn ");
                    System.exit(0);
                    break;
            }
        }


    }

}

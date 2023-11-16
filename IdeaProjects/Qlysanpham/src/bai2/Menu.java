package bai2;

import java.util.Scanner;

public class Menu {
    Manage manage = new Manage();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    @Override
    public String toString() {
        return "Menu{" +
                "manage=" + manage +
                ", inputInt=" + inputInt +
                ", inputString=" + inputString +
                '}';
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("--Library--" +
                    "\n1. Hien danh sach " +
                    "\n2. Them " +
                    "\n3. Xoa " +
                    "\n4. Tim kiem " +
                    "\n0. Thoat "


            );
            System.out.println("TT_ Nhap lua chon");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    manage.showList();
                    break;
                case 2:
                    themTailieu();
                    break;
                case 3:
                    System.out.println("nhap id muốn xóa");
                    int deleteID = inputInt.nextInt();
                    manage.delete(deleteID);
                    break;
                case 4:
                    timTailieu();
                    break;
                case 0:
                    break;
            }

        } while (choice != 0);


    }

    public void themTailieu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("------" +
                    "\n1. Thêm sách" +
                    "\n2. Thêm tạp chí" +
                    "\n3. Thêm báo" +
                    "\n4. Quay lại"

            );
            System.out.println("lựa chọn ");
            choice = inputInt.nextInt();


            if (choice == 1) {

                System.out.println("Id");
                int newID = inputInt.nextInt();
                System.out.println("nxb");
                String nxbName = inputString.nextLine();
                System.out.println("sl");
                int slSb = inputInt.nextInt();
                System.out.println("Author's Name");
                String authorsName = inputString.nextLine();
                System.out.println("Numbers Of Pages");
                int numOfPages = inputInt.nextInt();
                manage.add(new Book(newID, nxbName, slSb, authorsName, numOfPages));
                System.out.println("Add Success");
            }
            if (choice == 2) {
                {
                    System.out.println("Id");
                    int manuName = inputInt.nextInt();
                    System.out.println("nxb");
                    String nxbName = inputString.nextLine();
                    System.out.println("sl");
                    int slSb = inputInt.nextInt();
                    System.out.println("issueNumber");
                    int iNumber = inputInt.nextInt();
                    System.out.println("releaseMonth");
                    String rMonth = inputString.nextLine();
                    manage.add(new Magazine(manuName, nxbName, slSb, iNumber, rMonth));
                    System.out.println("Add Success");
                }
            }
            if (choice == 3) {

                System.out.println("Id");
                int newId = inputInt.nextInt();
                System.out.println("nxb");
                String nxbName = inputString.nextLine();
                System.out.println("sl");
                int slSb = inputInt.nextInt();
                System.out.println("releaseDay");
                int rDay = inputInt.nextInt();
                manage.add(new Newspaper(newId, nxbName, slSb, rDay));
                System.out.println("Add Sucess");

            }

            if (choice == 4) {
                manage.showList();
                showMenu();
            }
        }

    }


    public void timTailieu() {
        int choice1 = 1;
        while (choice1 != 0) {
            System.out.println("---Search---" +
                    "\n1. Tìm sách" +
                    "\n2. Tìm tạp chí" +
                    "\n3. Tìm báo" +
                    "\n4. Quay lại"

            );
            System.out.println("----");
            choice1 = inputInt.nextInt();

        if (choice1 == 1) {
            System.out.println("nhập Book id : ");
            int byId = inputInt.nextInt();
            System.out.println(manage.findById(byId));
        }
            if (choice1 == 2) {
                System.out.println("nhập Magazine id : ");
                int byId = inputInt.nextInt();
                System.out.println(manage.findById(byId));
            }
            if (choice1 == 3) {
                System.out.println("nhập Newspaper id : ");
                int byId = inputInt.nextInt();
                System.out.println(manage.findById(byId));
            }
        if (choice1==4){
            showMenu();
        }
        }
    }
}

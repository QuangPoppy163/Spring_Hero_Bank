package view;

import controller.BankController;
import entity.Employee;
import model.BankModel;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        generateMenu1();
    }

    public static void generateMenu1() {
        BankController bankController = new BankController();
        BankModel bankModel = new BankModel();

        while (true) {
            System.out.println("Ngân hàng ABC");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng kí");
            System.out.println("Hãy chọn chức năng:");
            Scanner scn = new Scanner(System.in);
            int choice = scn.nextInt();
            switch (choice) {
                case 1:
                    Employee employee = bankController.getInfo();
                    if (bankController.logIn(employee)) {
                    }
                    break;
                case 2:
                    Employee employee1 = bankController.getInfo();
                    if (bankController.register(employee1)) {
                        bankModel.insert(employee1);
                    }
                    ;
                    break;
                default:
                    System.out.println("Lựa chọn sai. Vui lòng lựa chọn lại.");
                    break;
            }
        }
    }
}

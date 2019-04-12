package controller;
import entity.Employee;
import model.BankModel;
import java.util.Scanner;

public class BankController {
    BankModel bankModel = new BankModel();

    public Employee getInfo() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Vui lòng nhập username");
        String username = scn.nextLine();
        System.out.println("Vui lòng nhập password");
        String password = scn.nextLine();
        return new Employee(account, password);
    }

    public boolean logIn(Employee employee) {
        Employee employee1 = bankModel.searchByAccount(employee.getAccount());

        if (employee1 == null) {
            System.err.println("Tài khoản không tồn tại");
            return false;
        } else {
            if (employee.getPassword().equals (employee1.getPassword())) {
                System.out.println("Bạn đã đăng nhập thành công");
                return true;

            } else {
                System.out.println("Bạn đã nhập sai mật khẩu. Vui lòng nhập lại");
                return false;
            }
        }
    }

    public boolean register(Employee acc) {
        Employee employee1 = bankModel.searchByAccount(acc.getAccount());
        Scanner scanner = new Scanner(System.in);
        public void register() {
            while (true) {
                System.out.println("****Register****");
                System.out.println("Vui lòng nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Vui lòng nhập địa chỉ: ");
                String address = scanner.nextLine();
                System.out.println("Vui lòng nhập email: ");
                String email = scanner.nextLine();
                System.out.println("Vui lòng nhập tên tài khoản: ");
                String account = scanner.nextLine();
                System.out.println("Vui lòng nhập mật khẩu: ");
                String password = scanner.nextLine();
                if (null == employee1) {
            System.out.println("Bạn đã đăng kí thành công");
            return true;
        } else {
            System.out.println("Tên tài khoàn đã tồn tại. Vui lòng chọn tên khác");
            return false;
        }
    }

}

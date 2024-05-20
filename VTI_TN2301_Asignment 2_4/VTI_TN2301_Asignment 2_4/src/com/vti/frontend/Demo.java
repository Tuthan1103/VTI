package com.vti.frontend;

import com.vti.utils.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        while (true) {
            String leftAlignFormat = "| %-72s |%n";
            System.out.format("+--------------------------------------------------------------------------+%n");
            System.out.format("|                        Choose please                                     |%n");
            System.out.format("+--------------------------------------------------------------------------+%n");
            System.out.format(leftAlignFormat, "1. Quản lý nhân viên.");
            System.out.format(leftAlignFormat, "2. Quản lý phòng ban.");
            System.out.format(leftAlignFormat, "3. Quản lý vị trí.");
            System.out.format(leftAlignFormat, "4. Thoát chương trình.");
            System.out.format("+--------------------------------------------------------------------------+%n");
            int chooseMenu = ScannerUtils.inputIntPositive();

            switch (chooseMenu) {
                case 1:
                    showMenuAccount();
                    break;
                case 2:
                    showMenuDepartment();
                    break;
                case 3:
                    showMenuPositon();
                    break;
                case 4:

                    return;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }

    private static void showMenuAccount() throws IOException {
        AccountFunction accountFunction = new AccountFunction();
        while (true) {
            String leftAlignFormat = "| %-72s |%n";
            System.out.format("+--------------------------------------------------------------------------+%n");
            System.out.format("|                        Choose please                                     |%n");
            System.out.format("+--------------------------------------------------------------------------+%n");
            System.out.format(leftAlignFormat, "1. Hiển thị danh sách Account");
            System.out.format(leftAlignFormat, "2. Tìm Account theo Id");
            System.out.format(leftAlignFormat, "3. Kiểm tra tên phòng ban có tồn tại?");
            System.out.format(leftAlignFormat, "4. Tạo mới phòng ban");
            System.out.format(leftAlignFormat, "5. Update phòng ban");
            System.out.format(leftAlignFormat, "6. Xóa phòng ban theo Id");
            System.out.format(leftAlignFormat, "7. Thoát");
            System.out.format("+--------------------------------------------------------------------------+%n");

            int choose = ScannerUtils.inputIntPositive();
            switch (choose) {
                case 1:
//                    Hiển thị danh sách Account
                    accountFunction.showListAccount();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }

    private static void showMenuPositon() {

    }

    private static void showMenuDepartment() throws IOException, SQLException, ClassNotFoundException {
        DepartmentFunction departmentFunction = new DepartmentFunction();
        while (true) {
            String leftAlignFormat = "| %-72s |%n";
            System.out.format("+--------------------------------------------------------------------------+%n");
            System.out.format("|                        Choose please                                     |%n");
            System.out.format("+--------------------------------------------------------------------------+%n");
            System.out.format(leftAlignFormat, "1. Hiển thị danh sách phòng ban");
            System.out.format(leftAlignFormat, "2. Tìm phòng ban theo Id");
            System.out.format(leftAlignFormat, "3. Kiểm tra tên phòng ban có tồn tại?");
            System.out.format(leftAlignFormat, "4. Tạo mới phòng ban");
            System.out.format(leftAlignFormat, "5. Update phòng ban");
            System.out.format(leftAlignFormat, "6. Xóa phòng ban theo Id");
            System.out.format(leftAlignFormat, "7. Thoát");
            System.out.format("+--------------------------------------------------------------------------+%n");

            int choose = ScannerUtils.inputIntPositive();
            switch (choose) {
                case 1:
//                    Hiển thị danh sách phòng ban
                    departmentFunction.showListDepartment();
                    break;
                case 2:
                    departmentFunction.showDepartmentById();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }
}

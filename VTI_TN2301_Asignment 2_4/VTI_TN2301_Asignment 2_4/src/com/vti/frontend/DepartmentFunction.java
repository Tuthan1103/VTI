package com.vti.frontend;

import com.vti.backend.presentationlayer.DepartmentController;
import com.vti.entity.Department;
import com.vti.utils.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentFunction {
    private DepartmentController departmentController;

    public DepartmentFunction() throws IOException {
        departmentController = new DepartmentController();
    }

    //    Hàm hiển thị danh sách phòng ban
    public void showListDepartment() throws SQLException, ClassNotFoundException {
        System.out.println("Danh sách phòng ban trên hệ thống");
//        Cần danh sách phòng ban? ==> Nhờ DepartmentController giúp
//        departmentController.getListDepartmentCotroller();
        List<Department> listDepartment = departmentController.getListDepartment();

        String leftAlignFormat = "| %-6d | %-21s |%n";
        System.out.format("+--------+-----------------------+%n");
        System.out.format("|   ID   | Department Name       |%n");
        System.out.format("+--------+-----------------------+%n");

        for (Department department : listDepartment) {
            System.out.format(leftAlignFormat, department.getId(), department.getName());
        }
        System.out.format("+--------+-----------------------+%n");

    }

    //   Hàm hiển thị danh sách phòng ban theo ID
    public void showDepartmentById() throws SQLException, ClassNotFoundException {
        System.out.println("Tìm phòng ban theo ID");
        System.out.println("Mời bạn nhập vào ID cần tìm kiếm");
        int idFind = ScannerUtils.inputIntPositive();
        Department department = departmentController.getDepartmentByID(idFind);

        if (department != null) {
            String leftAlignFormat = "| %-6d | %-21s |%n";
            System.out.format("+--------+-----------------------+%n");
            System.out.format("|   ID   | Department Name       |%n");
            System.out.format("+--------+-----------------------+%n");
            System.out.format(leftAlignFormat, department.getId(), department.getName());
            System.out.format("+--------+-----------------------+%n");
        } else {
            System.out.println("Không tồn tại phòng này trên HT");
        }

    }
}

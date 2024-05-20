package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.DepartmentService;
import com.vti.backend.businesslayer.IDepartmentService;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentController {
    IDepartmentService departmentService;

    public DepartmentController() throws IOException {
        departmentService = new DepartmentService();
    }

    public List<Department> getListDepartment() throws SQLException, ClassNotFoundException {
//        Validate
//        Xử lý Exeption
        List<Department> listDepartment = departmentService.getListDepartment();
        return listDepartment;
    }

    public Department getDepartmentByID(int idFind) throws SQLException, ClassNotFoundException {
        Department department = departmentService.getDepartmentByID(idFind);
        return department;
    }
}

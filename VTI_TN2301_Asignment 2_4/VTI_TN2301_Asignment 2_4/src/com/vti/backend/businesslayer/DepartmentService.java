package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.DepartmentRepository;
import com.vti.backend.datalayer.IDepartmentRepository;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentService implements IDepartmentService {
    private IDepartmentRepository departmentRepository;

    public DepartmentService() throws IOException {
        departmentRepository = new DepartmentRepository();
    }

    @Override
    public List<Department> getListDepartment() throws SQLException, ClassNotFoundException {
//        Xử lý Logic dữ liệu
        List<Department> listDepartment = departmentRepository.getListDepartment();
        return listDepartment;
    }

    @Override
    public Department getDepartmentByID(int idFind) throws SQLException, ClassNotFoundException {
        Department department = departmentRepository.getDepartmentByID(idFind);
        return department;
    }
}

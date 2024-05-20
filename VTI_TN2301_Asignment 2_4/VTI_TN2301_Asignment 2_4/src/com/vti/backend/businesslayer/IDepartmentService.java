package com.vti.backend.businesslayer;

import com.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentService {
    List<Department> getListDepartment() throws SQLException, ClassNotFoundException;

    Department getDepartmentByID(int idFind) throws SQLException, ClassNotFoundException;
}

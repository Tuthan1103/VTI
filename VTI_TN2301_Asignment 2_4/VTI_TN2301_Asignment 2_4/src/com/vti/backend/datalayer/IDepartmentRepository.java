package com.vti.backend.datalayer;

import com.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentRepository {
    List<Department> getListDepartment() throws SQLException, ClassNotFoundException;

    Department getDepartmentByID(int idFind) throws SQLException, ClassNotFoundException;
}

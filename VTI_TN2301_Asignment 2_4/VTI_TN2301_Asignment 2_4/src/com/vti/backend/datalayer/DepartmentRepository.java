package com.vti.backend.datalayer;

import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository implements IDepartmentRepository {
    private JdbcUtils jdbcUtils;

    public DepartmentRepository() throws IOException {
        jdbcUtils = new JdbcUtils();
    }

    @Override
    public List<Department> getListDepartment() throws SQLException, ClassNotFoundException {
//        Kết nối DB và lấy dữ liệu
        String sql = "SELECT * FROM Department ORDER BY DepartmentID LIMIT 10";
        ResultSet resultSet = jdbcUtils.executeQuery(sql);
        List<Department> listDepartment = new ArrayList<Department>();
        while (resultSet.next()) {
            Department dep = new Department(resultSet.getInt("DepartmentID"), resultSet.getString("DepartmentName"));
            listDepartment.add(dep);
        }
        return listDepartment;

    }

    @Override
    public Department getDepartmentByID(int idFind) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM Department WHERE DepartmentID = ?";
        PreparedStatement preStatement = jdbcUtils.createPrepareStatement(sql);
        preStatement.setInt(1, idFind);
        ResultSet result = preStatement.executeQuery();
        if (result.next()) {
            Department department = new Department(result.getInt("DepartmentID"), result.getNString("DepartmentName"));
            return department;
        } else {
            return null;
        }
    }
}

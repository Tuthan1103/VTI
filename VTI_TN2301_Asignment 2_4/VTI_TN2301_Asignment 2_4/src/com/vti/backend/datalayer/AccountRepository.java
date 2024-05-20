package com.vti.backend.datalayer;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements IAccountRepository {
    private JdbcUtils jdbcUtils;

    private IDepartmentRepository departmentRepository;

    public AccountRepository() throws IOException {
        jdbcUtils = new JdbcUtils();
        departmentRepository = new DepartmentRepository();
    }

    @Override
    public List<Account> getListAccount() throws SQLException, ClassNotFoundException {
//        Kết nối DB và lấy dữ liệu
        String sql = "SELECT * FROM account ORDER BY AccountID";
        ResultSet resultSet = jdbcUtils.executeQuery(sql);

        List<Account> listAccounts = new ArrayList<Account>();

        while (resultSet.next()) {
            Account account = new Account();
            account.setId(resultSet.getInt(1));
            account.setEmail(resultSet.getString(2));
            account.setUsername(resultSet.getString(3));
            account.setFullName(resultSet.getString(4));
            //     resultSet.getInt(5) // id =5  ==>Từ cái id ==> Department, id , name  // getDepartmentByID
            Department department = departmentRepository.getDepartmentByID(resultSet.getInt(5));
            account.setDepartment(department);

            // Làm tương tự cho Position
            
            account.setCreateDate(resultSet.getDate(7).toLocalDate());

            listAccounts.add(account);
        }
        return listAccounts;
    }
}

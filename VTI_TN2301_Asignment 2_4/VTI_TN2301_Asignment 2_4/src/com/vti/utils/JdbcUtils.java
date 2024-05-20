package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private Properties property;
    private Connection connection;

    public JdbcUtils() throws FileNotFoundException, IOException {
        property = new Properties();
        property.load(new FileInputStream(
                "C:\\Users\\D.Nguyen\\Desktop\\VTI\\VTI_TN2301_Asignment 2_4\\VTI_TN2301_Asignment 2_4\\src\\com\\vti\\resources\\database.properties"));
    }

    // Kiểm tra kết nối tới DB, nếu kết nối thành công Connect Success
//    Không thành công thì sẽ có Exeption
    public void connnectionTestting() throws ClassNotFoundException, SQLException {
        String url = property.getProperty("jdbc:mysql://localhost:3306/csdl");//jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1
        String Username = property.getProperty("root");  // root
        String password = property.getProperty("");  // root
        String dirver = property.getProperty("driver");

        Class.forName(dirver);
        connection = DriverManager.getConnection(url, Username, password);
        System.out.println("Connect Success");
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = property.getProperty("url");
        String Username = property.getProperty("username");
        String password = property.getProperty("password");
        String dirver = property.getProperty("driver");
        Class.forName(dirver);
        connection = DriverManager.getConnection(url, Username, password);
        return connection;
    }

    public void disConnection() throws SQLException {
        connection.close();
    }

    public ResultSet executeQuery(String sql) throws ClassNotFoundException, SQLException {
        Connection connnection = getConnection();
        Statement statement = connnection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        return result;
    }

    public PreparedStatement createPrepareStatement(String sql) throws ClassNotFoundException, SQLException {
        Connection connnection = getConnection();
        PreparedStatement preStatement = connnection.prepareStatement(sql);
        return preStatement;
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class connectSql {
    Connection connection = null;

    public connectSql(String ur, String ps, String u) {
        // TODO code application logic here
        // Thông tin kết nối đến cơ sở dữ liệu
        String url = u;
        String username = ur;
        String password = ps;

        // Biến Connection để quản lý kết nối

        try {
            // Kết nối đến cơ sở dữ liệu
            connection = DriverManager.getConnection(url, username, password);
            
            // Kiểm tra kết nối thành công
            if (connection != null) {
                System.out.println("Kết nối thành công đến cơ sở dữ liệu SQL Server!");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối đến cơ sở dữ liệu: " + e.getMessage());
        }
    }
    
    public ResultSet getQuery(String sql)
    {   
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(connectSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int getUpdateQuery(String sql)
    {   
        try {
            Statement s = connection.createStatement();
            int count = s.executeUpdate(sql);
            return count;
        } catch (SQLException ex) {
            return 0;
        }
    }
}

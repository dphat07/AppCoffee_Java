/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nqghu
 */
public final class DB_Connect {
    Connection con;
    String user, pass, db;

    public DB_Connect(Connection con, String user, String pass, String db) {
        this.con = con;
        this.user = user;
        this.pass = pass;
        this.db = db;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
    
    
    public Connection connectSQL(String user, String pass, String db) throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + db;
        Connection conn;
        conn = DriverManager.getConnection(url, user, pass);
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "kết nối thành công");
            return conn;
        }
        else 
            return null;
    }
    
    public DB_Connect(String user, String pass, String db) throws SQLException, ClassNotFoundException {
        this.user = user;
        this.pass = pass;
        this.db = db;
        this.con = connectSQL(user, pass, db);
    }
    
    public ResultSet getReader(String sql) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public int getUpdateQuery(String sql)
    {   
        try {
            Statement st = con.createStatement();
            int count = st.executeUpdate(sql);
            return count;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public int GetNonQuery(String sql) throws SQLException {
        Statement st = con.createStatement();
        int count = st.executeUpdate(sql);
        return count;
    }
    
    public void closeSQL() throws SQLException {
        if(con != null && !con.isClosed()) {
            con.close();
        }
    }
}

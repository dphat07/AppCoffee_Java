/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Controller;

import appcoffee.DB_Connect;
import appcoffee.Model.DinhLuongMon;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nqghu
 */
public class DinhLuongMonController {
    ArrayList<DinhLuongMon> dsDLMon;

    public DinhLuongMonController(ArrayList<DinhLuongMon> dsDLMon) {
        this.dsDLMon = dsDLMon;
    }

    public ArrayList<DinhLuongMon> getDs() {
        return dsDLMon;
    }

    public void setDs(ArrayList<DinhLuongMon> dsDLMon) {
        this.dsDLMon = dsDLMon;
    }

   
    
    public static ArrayList<DinhLuongMon> init(DB_Connect conn) throws SQLException {
        ArrayList<DinhLuongMon> ds = new ArrayList();
        String sql = "exec xemDinhLuongMon";
        ResultSet rs = conn.getReader(sql);
        while(rs.next()) {
            String tenMon = String.valueOf(rs.getString("tenMon"));
            String tenNguyenLieu = String.valueOf(rs.getString("tenNguyenLieu"));
            int mon = Integer.valueOf(rs.getString("idMon"));
            int nguyenlieu = Integer.valueOf(rs.getString("idNguyenLieu"));
            float dinhLuong = Float.valueOf(rs.getString("dinhLuong"));
            DinhLuongMon dl = new DinhLuongMon(tenMon, tenNguyenLieu, mon, nguyenlieu, dinhLuong);
            ds.add(dl);
        }
        return ds;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Controller;
import appcoffee.DB_Connect;
import appcoffee.Model.Loai;

import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class LoaiController {
    ArrayList<Loai> dsLoai;
    
    public LoaiController() {
        dsLoai = new ArrayList();
    }
    
    public void themLoai(Loai loai) {
        dsLoai.add(loai);
    }
    
    public void suaLoai(Loai loai) {
        for(Loai a : dsLoai) {
            if(a.getIdLoai() == loai.getIdLoai()) {
                a.setTenLoai(loai.getTenLoai());
            }
        }
    }
    
    public LoaiController init(DB_Connect conn) throws SQLException {
        LoaiController ds = new LoaiController();
        String sql = "select * from Loai";
        ResultSet rs = conn.getReader(sql);
        while(rs.next()) {
            int idLoai = Integer.parseInt(rs.getString("idLoai"));
            String ten = String.valueOf(rs.getString("tenLoai"));
            Loai loai = new Loai(idLoai, ten);
            ds.themLoai(loai);
        }
        return ds;
    }
}

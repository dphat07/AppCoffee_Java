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

    public LoaiController(ArrayList<Loai> dsLoai) {
        this.dsLoai = dsLoai;
    }
    
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
    
    public static ArrayList<Loai> init(DB_Connect conn) throws SQLException {
        ArrayList<Loai> ds = new ArrayList();
        String sql = "select * from Loai";
        ResultSet rs = conn.getReader(sql);
        while(rs.next()) {
            int idLoai = Integer.parseInt(rs.getString("idLoai"));
            String ten = String.valueOf(rs.getString("tenLoai"));
            Loai loai = new Loai(idLoai, ten);
            ds.add(loai);
        }
        return ds;
    }
    
    public static Loai timLoai(LoaiController ds, int id) {
        for(Loai loai : ds.dsLoai) {
            if(loai.getIdLoai() == id)
                return loai;
        }
        return null;
    }
    
    public ArrayList<Loai> timLoai_Ten(String ten) {
        ArrayList<Loai> dstim = new ArrayList();
        for(Loai loai: dsLoai) {
            if(loai.getTenLoai().contains(ten))
                dstim.add(loai);
        }
        return dstim;
    }

}

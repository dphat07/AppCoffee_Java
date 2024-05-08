/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Controller;
import appcoffee.DB_Connect;
import appcoffee.Model.Mon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class MonController {
    ArrayList<Mon> dsmon;
    
    public MonController() {
        dsmon = new ArrayList();
    }
    
    public MonController(ArrayList<Mon> ds) {
        dsmon = ds;
    }
    
    public void themMon(Mon mon) {
        dsmon.add(mon);
    }
    
    public void suaMon(Mon mon) {
        for(Mon a : dsmon) {
            if(a.getIdMon() == mon.getIdMon()) {
                a.setIdLoai(mon.getIdLoai());
                a.setTen(mon.getTen());  
                a.setGia(mon.getGia());
                a.setMoTa(mon.getMoTa());
                a.setTrangThai(mon.getTrangThai());
            }
        }
    }
    
    public void xoaMon(int id) {
        for(Mon a : dsmon) {
            if(a.getIdMon() == id)
                dsmon.remove(a);
        }
    }
    
    public static ArrayList<Mon> init(DB_Connect conn) throws SQLException {
//        MonController ds = new MonController();
        ArrayList<Mon> ds = new ArrayList();
        String sql = "select * from Mon";
        ResultSet rs = conn.getReader(sql);
        while(rs.next()) {
            int idMon = Integer.parseInt(rs.getString("idMon"));
            int idLoai = Integer.parseInt(rs.getString("idLoai"));
            int gia = Integer.parseInt(rs.getString("gia"));
            String ten = String.valueOf(rs.getString("tenMon"));
            String moTa = String.valueOf(rs.getString("moTa"));
            int trangThai = Integer.parseInt(rs.getString("trangThai"));
            Mon mon = new Mon(idMon, ten, idLoai, gia, moTa, trangThai);
            ds.add(mon);
        }
        return ds;
    }
}

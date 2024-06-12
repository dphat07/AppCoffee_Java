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
    
    public MonController(ArrayList<Mon> dsmon) {
        this.dsmon = dsmon;
    }
   
    public void themMon(Mon mon) {
        dsmon.add(mon);
    }
    
    public static Mon timMon(MonController ds, int id) {
        for(Mon mon : ds.dsmon) {
            if(mon.getIdMon()== id)
                return mon;
        }
        return null;
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
            String image = String.valueOf(rs.getString("image"));
            Mon mon = new Mon(idMon, ten, idLoai, gia, moTa, trangThai, image);
            ds.add(mon);
        }
        return ds;
    }
    
    public String getMoTa(int id) {
        for(Mon mon : dsmon) {
            if(mon.getIdMon() == id)
                return mon.getMoTa();
        }
        return "";
    }
    
    public String getImage(int id) {
        for(Mon mon : dsmon) {
            if(mon.getIdMon() == id)
                return mon.getImage();
        }
        return "";
    }
    
    public ArrayList<Mon> timMon(String ten) {
        ArrayList<Mon> dstim = new ArrayList();
        for(Mon mon : dsmon) {
            if(mon.getTen().contains(ten) || mon.getMoTa().contains(ten))
                dstim.add(mon);
        }
        return dstim;
    }
    
    public String timTenMon(int id) {
        for(Mon mon : dsmon) {
            if(mon.getIdMon() == id)
                return mon.getTen();
        }
        return "";
    }
    
    public static int timIDMon(MonController ds, String ten) {
        for(Mon mon : ds.dsmon) {
            if(mon.getTen().equals(ten))
                return mon.getIdMon();
        }
        return -1;
    }
}

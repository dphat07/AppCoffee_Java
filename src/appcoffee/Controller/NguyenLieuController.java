/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Controller;

import appcoffee.DB_Connect;
import appcoffee.Model.NguyenLieu;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class NguyenLieuController {
    ArrayList<NguyenLieu> dsNguyenLieu;
    
    public NguyenLieuController() {
        dsNguyenLieu = new ArrayList();
    }
    
    public NguyenLieuController(ArrayList<NguyenLieu> dsNguyenLieu) {
        this.dsNguyenLieu = dsNguyenLieu;
    }
   
    public void themNguyenLieu(NguyenLieu nguyenlieu) {
        dsNguyenLieu.add(nguyenlieu);
    }
    
    public void suaNguyenLieu(NguyenLieu nguyenlieu) {
        for(NguyenLieu a : dsNguyenLieu) {
            if(a.getIdNguyenLieu()== nguyenlieu.getIdNguyenLieu()) {
                a.setGiaNhap(nguyenlieu.getGiaNhap());
                a.setSlBan(nguyenlieu.getSlBan());
                a.setSlTon(nguyenlieu.getSlTon());
                a.setSlNhap(nguyenlieu.getSlNhap());
            }
        }
    }
    
    public void xoaMon(int id) {
        for(NguyenLieu a : dsNguyenLieu) {
            if(a.getIdNguyenLieu() == id)
                dsNguyenLieu.remove(a);
        }
    }
    
    public static ArrayList<NguyenLieu> init(DB_Connect conn) throws SQLException {
//        MonController ds = new MonController();
        ArrayList<NguyenLieu> ds = new ArrayList();
        String sql = "select * from NguyenLieu";
        ResultSet rs = conn.getReader(sql);
        while(rs.next()) {
            int id = Integer.parseInt(rs.getString("idNguyenLieu"));
            String ten = String.valueOf(rs.getString("tenNguyenLieu"));
            int gia = Integer.parseInt(rs.getString("giaNhap"));
            int nhap = Integer.parseInt(rs.getString("SLNhap"));
            int ban = Integer.parseInt(rs.getString("SLBan"));
            int ton = Integer.parseInt(rs.getString("SLTon"));
            String img = String.valueOf(rs.getString("img"));
            NguyenLieu nguyenlieu = new NguyenLieu(id, ten, nhap, ban, gia, ton, img);
            ds.add(nguyenlieu);
        }
        return ds;
    }
    
    public String getImage(int id) {
        for(NguyenLieu a : dsNguyenLieu) {
            if(a.getIdNguyenLieu()== id)
                return a.getImg();
        }
        return "";
    }
    
    public ArrayList<NguyenLieu> timNguyenLieu(String ten) {
        ArrayList<NguyenLieu> dstim = new ArrayList();
        for(NguyenLieu a : dsNguyenLieu) {
            if(a.getTenNguyenLieu().contains(ten))
                dstim.add(a);
        }
        return dstim;
    }
    
    public String timTenNguyenLieu(int id) {
        for(NguyenLieu nguyenlieu : dsNguyenLieu) {
            if(nguyenlieu.getIdNguyenLieu()== id)
                return nguyenlieu.getTenNguyenLieu();
        }
        return "";
    }
    
    public static NguyenLieu timNguyenLieu(NguyenLieuController ds, int id) {
        for(NguyenLieu nguyenlieu : ds.dsNguyenLieu) {
            if(nguyenlieu.getIdNguyenLieu()== id)
                return nguyenlieu;
        }
        return null;
    }
    
    public static  int timIDNguyenLieu(NguyenLieuController ds, String ten) {
        for(NguyenLieu nguyenlieu : ds.dsNguyenLieu) {
            if(nguyenlieu.getTenNguyenLieu().equals(ten))
                return nguyenlieu.getIdNguyenLieu();
        }
        return -1;
    }
}

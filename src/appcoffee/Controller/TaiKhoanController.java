/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Controller;
import appcoffee.DB_Connect;
import appcoffee.Model.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class TaiKhoanController {
    ArrayList<TaiKhoan> dsTaiKhoan;
    
    public TaiKhoanController() {
        dsTaiKhoan = new ArrayList();
    }
    
     public TaiKhoanController(ArrayList<TaiKhoan> ds) {
        this.dsTaiKhoan = ds;
    }

    
    public void themTK(TaiKhoan tk) {
        dsTaiKhoan.add(tk);
    }
    
    public void xoaTK(int id) {
        for(TaiKhoan tk : dsTaiKhoan) {
            if(tk.getIdTaiKhoan() == id) 
                dsTaiKhoan.remove(tk);
        }
    }
    
    public void suaTK(TaiKhoan tk){
        for(TaiKhoan a : dsTaiKhoan) {
            if(a.getIdTaiKhoan() == tk.getIdTaiKhoan()) {
                a.setTenHienThi(tk.getTenHienThi());
                a.setTenDangNhap(tk.getTenDangNhap());
                a.setMatKhau(tk.getMatKhau());
                a.setChucVu(tk.getChucVu());
            }
        }
    }
    
    public static ArrayList<TaiKhoan> init(DB_Connect conn) throws SQLException {
        ArrayList<TaiKhoan> ds = new ArrayList();
        String sql = "select * from TaiKhoan";
        ResultSet rs = conn.getReader(sql);
        while(rs.next()) {
            int id = Integer.parseInt(rs.getString("idTaiKhoan"));
            String tenHienThi = String.valueOf(rs.getString("tenHienThi"));
            String tenDangNhap = String.valueOf(rs.getString("tenDangNhap"));
            String matKhau = String.valueOf(rs.getString("matKhau"));
            String chucVu = String.valueOf(rs.getString("chucVu"));
            TaiKhoan tk = new TaiKhoan(id, tenHienThi, tenDangNhap, matKhau, chucVu);
            ds.add(tk);
        }
        return ds;
    }
    
    public ArrayList<TaiKhoan> timTaiKhoan(String ten) {
        ArrayList<TaiKhoan> dstim = new ArrayList();
        for(TaiKhoan tk : dsTaiKhoan) {
            if(tk.getTenDangNhap().contains(ten))
                dstim.add(tk);
        }
        return dstim;
    }
}

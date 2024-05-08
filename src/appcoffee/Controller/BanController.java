/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Controller;
import appcoffee.DB_Connect;
import appcoffee.Model.Ban;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class BanController {
    ArrayList<Ban> dsBan;
    
    public BanController() {
        dsBan = new ArrayList();
    }
    
    public void themBan(Ban ban) {
        dsBan.add(ban);
    }
    
    public void suaBan(Ban ban) {
        for(Ban a : dsBan) {
            if(a.getIdBan() == ban.getIdBan()) {
                a.setTenBan(ban.getTenBan());
                a.setTrangThai(ban.getTrangThai());
            }
        }
    }
    
    public void xoaBan(int id) {
        for(Ban ban : dsBan) {
            if(ban.getIdBan() == id)
                dsBan.remove(ban);
        }
    }
    
    public BanController init(DB_Connect conn) throws SQLException {
        BanController ds = new BanController();
        String sql = "select * from Ban";
        ResultSet rs = conn.getReader(sql);
        while(rs.next()) {
            int idBan = Integer.parseInt(rs.getString("idBan"));
            String ten = String.valueOf(rs.getString("tenBan"));
            int trangThai = Integer.parseInt(rs.getString("trangThai"));
            Ban ban = new Ban(idBan, trangThai, ten);
            ds.themBan(ban);
        }
        return ds;
    }
}

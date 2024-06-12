/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Controller;

import appcoffee.Model.TrangThai_Ban;
import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class TrangThai_BanController {
    public ArrayList<TrangThai_Ban> getDs() {
        return ds;
    }

    public void setDs(ArrayList<TrangThai_Ban> ds) {
        this.ds = ds;
    }
    ArrayList<TrangThai_Ban> ds;

    public TrangThai_BanController(ArrayList<TrangThai_Ban> ds) {
        this.ds = ds;
    }
    
    public TrangThai_Ban timTrangThai(int id) {
        for(TrangThai_Ban a : ds) {
            if(a.getId() == id)
                return a;
        }
        return null;
    }
    
    public static ArrayList<TrangThai_Ban> initTrangThai () {
        ArrayList<TrangThai_Ban> array = new ArrayList();
        TrangThai_Ban tt = new TrangThai_Ban(0, "Ngưng hoạt động");
        array.add(tt);
        tt = new TrangThai_Ban(1, "Còn hoạt động");
        array.add(tt);
        return array;
    }
}

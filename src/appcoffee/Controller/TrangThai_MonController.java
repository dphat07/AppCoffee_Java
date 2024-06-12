/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Controller;

import appcoffee.Model.TrangThai_Mon;
import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class TrangThai_MonController {

    public ArrayList<TrangThai_Mon> getDs() {
        return ds;
    }

    public void setDs(ArrayList<TrangThai_Mon> ds) {
        this.ds = ds;
    }
    ArrayList<TrangThai_Mon> ds;

    public TrangThai_MonController(ArrayList<TrangThai_Mon> ds) {
        this.ds = ds;
    }
    
    public TrangThai_Mon timTrangThai(int id) {
        for(TrangThai_Mon a : ds) {
            if(a.getId() == id)
                return a;
        }
        return null;
    }
    
    public static ArrayList<TrangThai_Mon> initTrangThai () {
        ArrayList<TrangThai_Mon> array = new ArrayList();
        TrangThai_Mon tt = new TrangThai_Mon(0, "Hết");
        array.add(tt);
        tt = new TrangThai_Mon(1, "Còn");
        array.add(tt);
        return array;
    }
}

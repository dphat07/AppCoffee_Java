/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee;

import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class DSMon {
    ArrayList<Mon> dsmon;
    
    public DSMon() {
        dsmon = new ArrayList();
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
}

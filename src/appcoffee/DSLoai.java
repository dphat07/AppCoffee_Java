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
public class DSLoai {
    ArrayList<Loai> dsLoai;
    
    public DSLoai() {
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
}

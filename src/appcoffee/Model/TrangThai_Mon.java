/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Model;

import java.util.ArrayList;

/**
 *
 * @author nqghu
 */
public class TrangThai_Mon {
    int id;
    String ten;

    public TrangThai_Mon(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public TrangThai_Mon() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
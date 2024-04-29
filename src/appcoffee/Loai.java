/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee;

/**
 *
 * @author nqghu
 */
public class Loai {
    int idLoai;
    String tenLoai;

    public int getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Loai() {
    }

    public Loai(int idLoai, String tenLoai) {
        this.idLoai = idLoai;
        this.tenLoai = tenLoai;
    }
    
    @Override
    public String toString() {
        return tenLoai;
    }
}

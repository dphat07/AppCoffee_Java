/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Model;

/**
 *
 * @author nqghu
 */
public class Ban {
    int idBan, trangThai;

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Ban(int idBan, int trangThai, String tenBan, String img) {
        this.idBan = idBan;
        this.trangThai = trangThai;
        this.tenBan = tenBan;
        this.img = img;
    }

    public Ban() {
    }
    String tenBan;
    String img;
}

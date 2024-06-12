/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Model;

/**
 *
 * @author nqghu
 */
public class NguyenLieu {
    int idNguyenLieu;
    String tenNguyenLieu;
    int slNhap;
    int slBan;
    int giaNhap;
    int slTon;
    String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getIdNguyenLieu() {
        return idNguyenLieu;
    }

    public void setIdNguyenLieu(int idNguyenLieu) {
        this.idNguyenLieu = idNguyenLieu;
    }

    public String getTenNguyenLieu() {
        return tenNguyenLieu;
    }

    public void setTenNguyenLieu(String tenNguyenLieu) {
        this.tenNguyenLieu = tenNguyenLieu;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public int getSlBan() {
        return slBan;
    }

    public void setSlBan(int slBan) {
        this.slBan = slBan;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public NguyenLieu(int idNguyenLieu, String tenNguyenLieu, int slNhap, int slBan, int giaNhap, int slTon, String img) {
        this.idNguyenLieu = idNguyenLieu;
        this.tenNguyenLieu = tenNguyenLieu;
        this.slNhap = slNhap;
        this.slBan = slBan;
        this.giaNhap = giaNhap;
        this.slTon = slTon;
        this.img = img;
    }
    
    public NguyenLieu() {
     
    }
    
    @Override
    public String toString() {
        return tenNguyenLieu;
    }   
}

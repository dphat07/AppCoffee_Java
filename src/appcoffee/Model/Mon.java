/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Model;

/**
 *
 * @author nqghu
 */
public class Mon {
    int idMon;
    String ten;
    int idLoai;
    int gia;
    String moTa;
    int trangThai;
    String image;

    public int getIdMon() {
        return idMon;
    }

    public void setIdMon(int idMon) {
        this.idMon = idMon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Mon() {
    }
    
    @Override
    public String toString() {
        return ten;
    }   

    public Mon(int idMon, String ten, int idLoai, int gia, String moTa, int trangThai, String image) {
        this.idMon = idMon;
        this.ten = ten;
        this.idLoai = idLoai;
        this.gia = gia;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Model;

/**
 *
 * @author nqghu
 */
public class DinhLuongMon {

    public int getIdMon() {
        return idMon;
    }

    public void setIdMon(int idMon) {
        this.idMon = idMon;
    }

    public int getIdNguyenLieu() {
        return idNguyenLieu;
    }

    public void setIdNguyenLieu(int idNguyenLieu) {
        this.idNguyenLieu = idNguyenLieu;
    }

    public float getDinhLuong() {
        return dinhLuong;
    }

    public void setDinhLuong(float dinhLuong) {
        this.dinhLuong = dinhLuong;
    }

    public DinhLuongMon() {
    }

    String tenMon;
    String tenNguyenLieu;
    int idMon;
    int idNguyenLieu;
    float dinhLuong;

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getTenNguyenLieu() {
        return tenNguyenLieu;
    }

    public void setTenNguyenLieu(String tenNguyenLieu) {
        this.tenNguyenLieu = tenNguyenLieu;
    }

    public DinhLuongMon(String tenMon, String tenNguyenLieu, int idMon, int idNguyenLieu, float dinhLuong) {
        this.tenMon = tenMon;
        this.tenNguyenLieu = tenNguyenLieu;
        this.idMon = idMon;
        this.idNguyenLieu = idNguyenLieu;
        this.dinhLuong = dinhLuong;
    }
}

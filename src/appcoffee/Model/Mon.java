/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcoffee.Model;

/**
 *
 * @author nguye
 */
public class Mon {
    
    int maMonAn;
    String tenMonAn;
    int giaMonAn;
    int maLoaiMonAn;
    String moTa;
    Boolean trangThai;

    public int getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(int maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public int getGiaMonAn() {
        return giaMonAn;
    }

    public void setGiaMonAn(int giaMonAn) {
        this.giaMonAn = giaMonAn;
    }

    public int getMaLoaiMonAn() {
        return maLoaiMonAn;
    }

    public void setMaLoaiMonAn(int maLoaiMonAn) {
        this.maLoaiMonAn = maLoaiMonAn;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public Mon()
    {
        maMonAn = 0;
        tenMonAn = "";
        giaMonAn = 0;
        maLoaiMonAn = 0;
        moTa = "";
        trangThai = false;
    }

    public Mon(int a, String b, int c, int d, String e, Boolean f)
    {
        maMonAn = a;
        tenMonAn = b;
        giaMonAn = c;
        maLoaiMonAn = d;
        moTa = e;
        trangThai = f;
    }

    public String getStatus(Boolean tt)
    {
        String[] trangthai = { "Hết", "Còn" };
        if (tt)
            return trangthai[1];
        else
            return trangthai[0];
    }
}

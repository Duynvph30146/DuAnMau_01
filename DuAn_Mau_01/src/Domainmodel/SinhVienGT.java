/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domainmodel;

/**
 *
 * @author Admin
 */
public class SinhVienGT {
    private String GioiTinh;

    public SinhVienGT() {
    }

    public SinhVienGT(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    @Override
    public String toString() {
        return GioiTinh;
    }
    
    
    
}

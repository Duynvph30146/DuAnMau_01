/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domainmodel;

/**
 *
 * @author Admin class ánh xạ 1-1 với bảng chức vụ trong csdl
 */
public class ChucVu {
    private String ID;
    private String Ma;
    private String Ten;

    public ChucVu() {
    }

    public ChucVu(String ID, String Ma, String Ten) {
        this.ID = ID;
        this.Ma = Ma;
        this.Ten = Ten;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return "ChucVu{" + "ID=" + ID + ", Ma=" + Ma + ", Ten=" + Ten + '}';
    }
    
    
    
}

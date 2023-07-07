/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Admin Class này chứa dữ liệu cho giao diện chức vụ 
 */
public class ChucVuViewModel {
    private String ID,Ma,Ten;

    public ChucVuViewModel() {
    }

    public ChucVuViewModel(String ID, String Ma, String Ten) {
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
    




    
    
}

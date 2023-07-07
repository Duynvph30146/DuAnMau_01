/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Domainmodel.ChucVu;
import Repositories.Imp.IChucVuRepository;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Admin Thao tác với dữ liệu chức vụ trong CSDL
 */
public class ChucVuRAMRepository implements IChucVuRepository{

    //Lưu trữ tạm thời Database vì chưa làm file kết nối
    private static ArrayList<ChucVu> listDS = new ArrayList();
static {
    listDS.add(new ChucVu(UUID.randomUUID().toString(), "CV001", "Chủ nhiệm bộ môn"));
    listDS.add(new ChucVu(UUID.randomUUID().toString(), "CV002", "Trưởng môn"));
    listDS.add(new ChucVu(UUID.randomUUID().toString(), "CV003", "Giảng viên"));
}
    //Hàm này dùng để thêm một đối tượng chức vụ mới
    //Nếu trả về true thì thêm thất bại
 
    public boolean them(ChucVu chucVu) {
        //Thêm vào CSDL đối tượng chức vụ mới
        listDS.add(chucVu);
        //Trả về kết quả là đã thêm thành công
        return true;

    }
    
    //Hàm này dùng để LẤY DANH SÁCH chức vụ trong CSDL  
    public ArrayList<ChucVu>layDS(){
        return listDS;
        
    }

}

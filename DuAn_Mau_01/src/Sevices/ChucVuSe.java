/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevices;

import Domainmodel.ChucVu;
import Repositories.ChucVuRAMRepository;

import Repositories.ChucVuSQLRepository;
import ViewModel.ChucVuViewModel;
import java.util.ArrayList;
import Repositories.Imp.IChucVuRepository;
import Sevices.Imp.IChucVuService;

/**
 *
 * @author Admin xử lý logic 
 */
public class ChucVuSe implements IChucVuService{
    //Khai báo đối tượng phụ trách quản lý dữ liệu chức vụ
    private IChucVuRepository repo=(IChucVuRepository) new ChucVuSQLRepository();
    //Hàm này dùng để thêm một chức năng mới
    public void themMoiChucVu(ChucVu ChucVuMoi){
//        repo.Create(ChucVuMoi);
        
    }
    
    
    
//    Hàm này dùng để lấy danh sách các chức vụ
    public ArrayList<ChucVuViewModel> layDanhSachChucVu(){
        ArrayList<ChucVuViewModel> dsChucVuViewModel=new ArrayList<>();
        //Gọi repository trả về một danh sách chức vụ
        ArrayList<ChucVu> dsChucVu=repo.layDS();
        for (ChucVu cv : dsChucVu) {
            ChucVuViewModel chucVuViewModel=new ChucVuViewModel();
            chucVuViewModel.setID(cv.getID());
            chucVuViewModel.setMa(cv.getMa());
            chucVuViewModel.setTen(cv.getTen());
            //Thêm vào ds
            dsChucVuViewModel.add(chucVuViewModel);
            
            
        }
        return dsChucVuViewModel;
        
    }
   
    
}

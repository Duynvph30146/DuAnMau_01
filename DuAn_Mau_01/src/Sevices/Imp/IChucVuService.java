/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevices.Imp;

import Domainmodel.ChucVu;
import ViewModel.ChucVuViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IChucVuService {
    //Use case thêm chức vụ mới
    void themMoiChucVu(ChucVu ChucVuMoi);
    //Use case lấy DSCV
    ArrayList<ChucVuViewModel> layDanhSachChucVu();
    
}

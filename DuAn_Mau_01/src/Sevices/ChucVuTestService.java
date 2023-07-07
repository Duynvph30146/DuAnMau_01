/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevices;

import Domainmodel.ChucVu;
import Sevices.Imp.IChucVuService;
import ViewModel.ChucVuViewModel;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class ChucVuTestService implements IChucVuService {

    @Override
    public void themMoiChucVu(ChucVu ChucVuMoi) {
        System.out.println("chưa làm gì cả");
    }

    @Override
    public ArrayList<ChucVuViewModel> layDanhSachChucVu() {
        ArrayList<ChucVuViewModel> dsChucVu = new ArrayList<>();
        dsChucVu.add(new ChucVuViewModel(UUID.randomUUID().toString(), "CV001 ", "Chủ nhiệm bộ môn"));
        dsChucVu.add(new ChucVuViewModel(UUID.randomUUID().toString(), "CV002 "," Trưởng môn"));
        dsChucVu.add(new ChucVuViewModel(UUID.randomUUID().toString(), "CV003 ", "Giảng viên"));
        return dsChucVu;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevices;

import Domainmodel.SinhVien;
import Repositories.Imp.ISinhVienRepo;
import Repositories.SinhVienRepo;
import Sevices.Imp.ISinhVienSe;
import ViewModel.SinhVienViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SinhVienSe implements ISinhVienSe {

    private ISinhVienRepo svRepo;

    public SinhVienSe() throws Exception {
        svRepo = new SinhVienRepo();
    }

    @Override
    public ArrayList<SinhVienViewModel> layDS() {
        ArrayList<SinhVienViewModel> ListSVVM = new ArrayList<>();
        ArrayList<SinhVien> listSV = svRepo.layDS();
        for (SinhVien sv : listSV) {
            SinhVienViewModel svVM = new SinhVienViewModel(sv.getMaSV(), sv.getHoTen(), sv.getSDT(), sv.getDiaChi(), sv.getGioiTinh());
            ListSVVM.add(svVM);

        }
        return ListSVVM;

    }

}

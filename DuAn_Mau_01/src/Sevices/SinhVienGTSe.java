/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevices;

import Domainmodel.SinhVienGT;
import Repositories.SinhVienGTRepo;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SinhVienGTSe {

    private SinhVienGTRepo svGTRepo = new SinhVienGTRepo();

    public ArrayList<SinhVienGT> findAll() throws Exception {
        return svGTRepo.findAll();
    }

}

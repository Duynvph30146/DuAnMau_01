/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Domainmodel.SinhVien;
import Repositories.Imp.ISinhVienRepo;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SinhVienRepo implements ISinhVienRepo {

    Connection con;

    public SinhVienRepo() throws Exception {
        con = DBConnection.getConnection();
    }

    @Override
    public ArrayList<SinhVien> layDS() {
        ArrayList<SinhVien> listSV = new ArrayList<>();

        try {
            String sql = "select * from sinhvien";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("MASV"));
                sv.setHoTen(rs.getString("HOTEN"));
                sv.setSDT(rs.getInt("SDT"));
                sv.setDiaChi(rs.getString("DIACHI"));
                sv.setGioiTinh(rs.getString("GIOITINH"));
                listSV.add(sv);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listSV;
    }

}

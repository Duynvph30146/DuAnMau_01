/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Domainmodel.SinhVienGT;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SinhVienGTRepo {

    public ArrayList<SinhVienGT> findAll() throws Exception {
        ArrayList<SinhVienGT> ListdsSVGT = new ArrayList<>();
        String sql = "select GIOITINH from SINHVIEN  ";
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            SinhVienGT svgt = new SinhVienGT();
            svgt.setGioiTinh(rs.getString("GIOITINH"));
            ListdsSVGT.add(svgt);
        }
        con.close();
        return ListdsSVGT;
    }
}

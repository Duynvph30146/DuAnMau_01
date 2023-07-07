/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Domainmodel.ChucVu;
import Repositories.Imp.IChucVuRepository;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ChucVuSQLRepository implements IChucVuRepository{

    public ArrayList<ChucVu> layDS() {
        ArrayList<ChucVu> dsChucVu = new ArrayList<>();
        try {

            Connection con = DBConnection.getConnection();
            String sql = "SELECT Id,Ma,Ten FROM ChucVu";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              String id=rs.getString("Id");
              String ma=rs.getString("Ma");
              String ten=rs.getString("Ten");
              
              ChucVu chucVu=new ChucVu(id, ma, ten);
              dsChucVu.add(chucVu);

            }
            rs.close();
            ps.close();
            con.close();

        } catch (Exception ex) {
            System.out.println("Lỗi kết nối");
            Logger.getLogger(ChucVuSQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsChucVu;
    }
    
     public Integer them(ChucVu cv) throws Exception {
        int ketQua = -1;
        Connection con = DBConnection.getConnection();
        String sql = "insert into ChucVu(Ma,Ten) values(?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, cv.getMa());
        ps.setString(2, cv.getTen());
     
        ketQua = ps.executeUpdate();
        return ketQua;

    }

    
}

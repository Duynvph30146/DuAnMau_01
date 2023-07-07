/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevices.Imp;

import Sevices.ChucVuTestService;
import Sevices.Imp.IChucVuService;

/**
 *
 * @author Admin
 */
public class ServiceFactory {
    public static IChucVuService getChucVuService(){
        return new ChucVuTestService();
    }
    
}

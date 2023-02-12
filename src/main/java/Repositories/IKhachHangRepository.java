/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Entities.KhachHang;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hrska
 */
public interface IKhachHangRepository {
    List<KhachHang> findAll();
     KhachHang findById(String id);
     KhachHang save(KhachHang khachHang);
     boolean delete(String id);
     public void save1 (String id, String ma, String ten, String tenDem, String ho, Date ngaySinh, String sdt, String diaChi, String thanhPho, String quocGia, String matKhau);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Dto.KhachHangDTO;
import Entities.KhachHang;
import java.util.List;

/**
 *
 * @author hrska
 */
public interface IKhachHangService {
    List<KhachHangDTO> getAll();
    KhachHangDTO getById(String id);
    KhachHangDTO create(KhachHangDTO khachHang);
    KhachHangDTO update(KhachHangDTO khachHang);
    boolean delete(String id);
}

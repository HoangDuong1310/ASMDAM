/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Dto.DongSPDTO;
import Entities.CuaHang;
import Entities.DongSP;
import java.util.List;

/**
 *
 * @author hrska
 */
public interface IDongSPRepository {
    List<DongSP> findAll();
    DongSP findById(DongSPDTO id);
    DongSP save(DongSP dongSP);
    boolean delete(String id);

    
}

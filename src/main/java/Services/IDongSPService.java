/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Dto.DongSPDTO;
import java.util.List;

/**
 *
 * @author hrska
 */
public interface IDongSPService {
    List<DongSPDTO> getAll();
    DongSPDTO getID(DongSPDTO id);
    DongSPDTO save(DongSPDTO dongSP);
    DongSPDTO update(DongSPDTO dongSPDTO);
    boolean delete(String id);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dto.CuaHangDTO;
import Dto.DongSPDTO;
import Entities.DongSP;
import Repositories.DongSPRepository;
import Repositories.IDongSPRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hrska
 */
public class DongSPService implements IDongSPService {

    IDongSPRepository repo = new DongSPRepository();
    List<DongSPDTO> dongSPDTO;

    @Override
    public List<DongSPDTO> getAll() {
        dongSPDTO = new ArrayList<>();
        var dongSP = repo.findAll();
        System.out.println("zzzzzz" + dongSP.size());
        for (DongSP dsp : dongSP) {
            dongSPDTO.add(new DongSPDTO(dsp.getId(), dsp.getMa(), dsp.getTen()));
        }
        return dongSPDTO;
    }

    @Override
    public DongSPDTO getID(DongSPDTO id) {
        var dsp = repo.findById(id);
        return new DongSPDTO(dsp.getId(), dsp.getMa(), dsp.getTen());

    }

    @Override
    public DongSPDTO save(DongSPDTO dongSP) {
        var dsp = repo.save(new DongSP(null, dongSP.getMa(), dongSP.getTen()));
        return new DongSPDTO(dsp.getId(), dsp.getMa(), dsp.getTen());
    }

    @Override
    public boolean delete(String id) {
        return repo.delete(id);
    }

    @Override
    public DongSPDTO update(DongSPDTO dongSPDTO) {
        var dsp = repo.save(new DongSP(null, dongSPDTO.getMa(), dongSPDTO.getTen()));

        return new DongSPDTO(dsp.getId(), dsp.getMa(), dsp.getTen());

    }

}

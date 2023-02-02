/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dto.CuaHangDTO;
import Entities.CuaHang;
import Repositories.CuaHangRepository;
import Repositories.ICuaHangRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hrska
 */
public class CuaHangService implements ICuaHangService {
    
    private final ICuaHangRepository cuaHangRepo;
    private List<CuaHangDTO> cuaHangDTO;
    
    public CuaHangService() {
        cuaHangRepo = new CuaHangRepository();
        cuaHangDTO = new ArrayList<>();
    }
    
    @Override
    public List<CuaHangDTO> getCuaHang() {
        cuaHangDTO = new ArrayList<>();
        var cuaHang = cuaHangRepo.findAll();
        for (CuaHang ch : cuaHang) {
            cuaHangDTO.add(new CuaHangDTO(ch.getId(), ch.getMa(), ch.getTen(), ch.getDiaChi(), ch.getThanhPho(), ch.getQuocGia()));
        }
        return cuaHangDTO;
        
    }
    
    @Override
    public CuaHangDTO getCuaHangById(CuaHangDTO id) {
        var ch = cuaHangRepo.findByID(id);
        return new CuaHangDTO(ch.getId(), ch.getMa(), ch.getTen(), ch.getDiaChi(), ch.getThanhPho(), ch.getQuocGia());
    }
    
    @Override
    public CuaHangDTO creatNewCuaHang(CuaHangDTO cuaHang) {
        var ch = cuaHangRepo.save(new CuaHang(null, cuaHang.getMa(), cuaHang.getTen(), cuaHang.getDiaChi(), cuaHang.getThanhPho(), cuaHang.getQuocGia()));
        return new CuaHangDTO(ch.getId(), ch.getMa(), ch.getTen(), ch.getDiaChi(), ch.getThanhPho(), ch.getQuocGia());
    }
    
    @Override
    public CuaHangDTO updateCuaHangById(CuaHangDTO cuaHang) {
        var ch = cuaHangRepo.save(new CuaHang(cuaHang.getId(), cuaHang.getMa(), cuaHang.getTen(), cuaHang.getDiaChi(), cuaHang.getThanhPho(), cuaHang.getQuocGia()));
        return new CuaHangDTO(ch.getId(), ch.getMa(), ch.getTen(), ch.getDiaChi(), ch.getThanhPho(), ch.getQuocGia());
    }
    
    @Override
    public boolean deleteCuaHangById(String id) {
        return cuaHangRepo.delete(id);
    }
    
}

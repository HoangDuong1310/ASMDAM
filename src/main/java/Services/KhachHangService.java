/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dto.KhachHangDTO;
import Entities.KhachHang;
import Repositories.IKhachHangRepository;
import Repositories.KhachHangRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hrska
 */
public class KhachHangService implements IKhachHangService {

    private final IKhachHangRepository repo;
    private List<KhachHangDTO> khachHangDTO;

    public KhachHangService() {
        repo = new KhachHangRepository();
        khachHangDTO = new ArrayList<>();
    }

    @Override
    public List<KhachHangDTO> getAll() {
        khachHangDTO = new ArrayList<>();
        var khachHang = repo.findAll();
        for (KhachHang kh : khachHang) {
            khachHangDTO.add(new KhachHangDTO(kh.getId(), kh.getMa(), kh.getTen(), kh.getTenDem(), kh.getHo(), kh.getNgaySinh(), kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau()));
        }
        return khachHangDTO;
    }

    @Override
    public KhachHangDTO getById(String id) {
        var kh = repo.findById(id);
        return new KhachHangDTO(kh.getId(), kh.getMa(), kh.getTen(), kh.getTenDem(), kh.getHo(), kh.getNgaySinh(), kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau());
    }

    @Override
    public KhachHangDTO create(KhachHangDTO khachHang) {

        var kh = repo.save(new KhachHang(null, khachHang.getMa(), khachHang.getTen(), khachHang.getTenDem(), khachHang.getHo(), khachHang.getNgaySinh(), khachHang.getSdt(), khachHang.getDiaChi(), khachHang.getThanhPho(), khachHang.getQuocGia(), khachHang.getMatKhau()));
        return new KhachHangDTO(kh.getId(), kh.getMa(), kh.getTen(), kh.getTenDem(), kh.getHo(), kh.getNgaySinh(), kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau());
    }

    @Override
    public KhachHangDTO update(KhachHangDTO khachHang) {
        var kh = repo.save(new KhachHang(khachHang.getId(), khachHang.getMa(), khachHang.getTen(), khachHang.getTenDem(), khachHang.getHo(), khachHang.getNgaySinh(), khachHang.getSdt(), khachHang.getDiaChi(), khachHang.getThanhPho(), khachHang.getQuocGia(), khachHang.getMatKhau()));
        return new KhachHangDTO(kh.getId(), kh.getMa(), kh.getTen(), kh.getTenDem(), kh.getHo(), kh.getNgaySinh(), kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau());
    }

    @Override
    public boolean delete(String id) {
        return repo.delete(id);
    }

}

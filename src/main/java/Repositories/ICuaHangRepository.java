package Repositories;

import Dto.CuaHangDTO;
import Entities.CuaHang;

import java.util.List;

public interface ICuaHangRepository {
    List<CuaHang> findAll();

    CuaHang findByID(CuaHangDTO id);

    CuaHang save(CuaHang cuaHang);

    boolean delete(String id);

    public  void save (String id, String ma, String ten, String DiaChi, String ThanhPho, String QuocGia);
}

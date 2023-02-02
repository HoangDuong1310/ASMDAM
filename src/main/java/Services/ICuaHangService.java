package Services;

import Dto.CuaHangDTO;

import java.util.List;

public interface ICuaHangService {
    List<CuaHangDTO> getCuaHang();
    CuaHangDTO getCuaHangById(CuaHangDTO id);
    CuaHangDTO creatNewCuaHang(CuaHangDTO cuaHang);
    CuaHangDTO updateCuaHangById(CuaHangDTO cuaHang);
    boolean deleteCuaHangById(String id);
}

package Services;

import Dto.ChucVuDTO;

import java.util.List;

public interface IChucVuService {
    List<ChucVuDTO> getChucVu();
    ChucVuDTO getChucVuById(String id);
    ChucVuDTO creatNewChucVu(ChucVuDTO mauSac);
    ChucVuDTO updateChucVuById(ChucVuDTO mauSac);
    boolean deleteChucVuById(String id);
}

package Services;

import Entities.ChucVu;
import Repositories.IChucVuRepository;
import Repositories.ChucVuRepository;
import Dto.ChucVuDTO;
import java.util.ArrayList;
import java.util.List;

public class ChucVuService implements IChucVuService {

    private final IChucVuRepository chucVuRepository;
    private List<ChucVuDTO> fromChucVu;

    public ChucVuService() {
        chucVuRepository = new ChucVuRepository();
        fromChucVu = new ArrayList<>();
    }

    @Override
    public List<ChucVuDTO> getChucVu() {
        fromChucVu = new ArrayList<>();
        var chucVu = chucVuRepository.findAll();
        for (ChucVu cv : chucVu) {
            fromChucVu.add(new ChucVuDTO(cv.getId(), cv.getMa(), cv.getTen()));
        }
        return fromChucVu;
    }

    @Override
    public ChucVuDTO getChucVuById(String id) {
        var cv = chucVuRepository.findByID(id);

        return new ChucVuDTO(cv.getId(), cv.getMa(), cv.getTen());
    }

    @Override
    public ChucVuDTO creatNewChucVu(ChucVuDTO chucVu) {
        var cv = chucVuRepository.save(new ChucVu(null, chucVu.getMa(), chucVu.getTen()));

        return new ChucVuDTO(cv.getId(), cv.getMa(), cv.getTen());
    }

    @Override
    public ChucVuDTO updateChucVuById(ChucVuDTO chucVu) {
        var cv = chucVuRepository.save(new ChucVu(chucVu.getId(), chucVu.getMa(), chucVu.getTen()));
        return new ChucVuDTO(cv.getId(), cv.getMa(), cv.getTen());
    }

    @Override
    public boolean deleteChucVuById(String id) {
        return chucVuRepository.delete(id);
    }
}

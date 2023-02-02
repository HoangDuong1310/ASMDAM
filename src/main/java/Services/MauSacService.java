package Services;

import Entities.MauSac;
import Repositories.IMauSacRepository;
import Repositories.MauSacRepository;
import Dto.MauSacDTO;

import java.util.ArrayList;
import java.util.List;

public class MauSacService implements IMauSacService{
    private final IMauSacRepository mauSacRepository;
    private  List<MauSacDTO> fromMauSac;

    public MauSacService() {
        mauSacRepository = new MauSacRepository();
        fromMauSac = new ArrayList<>();
    }

    @Override
    public List<MauSacDTO> getMauSac() {
fromMauSac = new ArrayList<>();
var mauSac = mauSacRepository.findAll();
for (MauSac ms : mauSac){
    fromMauSac.add(new MauSacDTO(ms.getId(), ms.getMa(), ms.getTen()));
}
        return fromMauSac;
    }

    @Override
    public MauSacDTO getMauSacById(String id) {
        var ms = mauSacRepository.findByID(id);

        return new MauSacDTO(ms.getId(), ms.getMa(), ms.getTen());
    }

    @Override
    public MauSacDTO creatNewMauSac(MauSacDTO mauSac) {
        mauSac.setId(null);
        var ms = mauSacRepository.save(new MauSac(mauSac.getMa(), mauSac.getTen()));

        return new MauSacDTO(mauSac.getId(), mauSac.getMa(), mauSac.getTen());
    }

    @Override
    public MauSacDTO updateMauSacById(MauSacDTO mauSac) {
        var ms = mauSacRepository.save(new MauSac(mauSac.getId(), mauSac.getMa(), mauSac.getTen()));
        return new MauSacDTO(ms.getId(), ms.getMa(), ms.getTen());
    }

    @Override
    public boolean deleteMauSacById(String id) {
        return mauSacRepository.delete(id);
    }
}

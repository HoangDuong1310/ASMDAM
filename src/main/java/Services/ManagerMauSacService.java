package Services;

import Entities.MauSac;
import Repositories.IMauSacRepository;
import Repositories.MauSacRepository;
import Dto.FromMauSac;

import java.util.ArrayList;
import java.util.List;

public class ManagerMauSacService implements IManagerMauSacService{
    private final IMauSacRepository mauSacRepository;
    private  List<FromMauSac> fromMauSac;

    public ManagerMauSacService() {
        mauSacRepository = new MauSacRepository();
        fromMauSac = new ArrayList<>();
    }

    @Override
    public List<FromMauSac> getMauSac() {
fromMauSac = new ArrayList<>();
var mauSac = mauSacRepository.findAll();
for (MauSac ms : mauSac){
    fromMauSac.add(new FromMauSac(ms.getId(), ms.getMa(), ms.getTen()));
}
        return fromMauSac;
    }

    @Override
    public FromMauSac getMauSacById(String id) {
        var ms = mauSacRepository.findByID(id);

        return new FromMauSac(ms.getId(), ms.getMa(), ms.getTen());
    }

    @Override
    public FromMauSac creatNewMauSac(FromMauSac mauSac) {
        mauSac.setId(null);
        var ms = mauSacRepository.save(new MauSac(mauSac.getMa(), mauSac.getTen()));

        return new FromMauSac(mauSac.getId(), mauSac.getMa(), mauSac.getTen());
    }

    @Override
    public FromMauSac updateMauSacById(FromMauSac mauSac) {
        var ms = mauSacRepository.save(new MauSac(mauSac.getId(), mauSac.getMa(), mauSac.getTen()));
        return new FromMauSac(ms.getId(), ms.getMa(), ms.getTen());
    }

    @Override
    public boolean deleteMauSacById(String id) {
        return mauSacRepository.delete(id);
    }
}

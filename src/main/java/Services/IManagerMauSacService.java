package Services;

import Dto.FromMauSac;

import java.util.List;

public interface IManagerMauSacService {
    List<FromMauSac> getMauSac();
    FromMauSac getMauSacById(String id);
    FromMauSac creatNewMauSac(FromMauSac mauSac);
    FromMauSac updateMauSacById(FromMauSac mauSac);
    boolean deleteMauSacById(String id);
}

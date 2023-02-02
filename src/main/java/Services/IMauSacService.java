package Services;

import Dto.MauSacDTO;

import java.util.List;

public interface IMauSacService {
    List<MauSacDTO> getMauSac();
    MauSacDTO getMauSacById(String id);
    MauSacDTO creatNewMauSac(MauSacDTO mauSac);
    MauSacDTO updateMauSacById(MauSacDTO mauSac);
    boolean deleteMauSacById(String id);
}

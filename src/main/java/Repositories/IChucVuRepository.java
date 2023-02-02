package Repositories;

import Entities.ChucVu;

import java.util.List;

public interface IChucVuRepository {
    List<ChucVu> findAll();

    ChucVu findByID(String id);

    ChucVu save(ChucVu chucVu);

    boolean delete(String id);

    public  void save (String id, String ma, String ten);
}

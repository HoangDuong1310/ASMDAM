package Repositories;

import Entities.MauSac;

import java.util.List;

public interface IMauSacRepository {
    List<MauSac> findAll();

    MauSac findByID(String id);

    MauSac save(MauSac mauSac);

    boolean delete(String id);

    public  void save (String id, String ma, String ten);
}

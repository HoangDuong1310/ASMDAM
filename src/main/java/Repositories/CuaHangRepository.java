/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Dto.CuaHangDTO;
import Entities.CuaHang;
import Entities.CuaHang;
import Entities.CuaHang;
import Utilities.DuongUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author hrska
 */
public class CuaHangRepository implements ICuaHangRepository {

    @Override
    public List<CuaHang> findAll() {
        List<CuaHang> cuaHang;
        try (Session session = DuongUtil.getFactory().openSession()) {
            Query<CuaHang> query = session.createQuery("FROM CuaHang ", CuaHang.class);
            cuaHang = query.getResultList();
        }
        return cuaHang;
    }

    @Override
    public CuaHang findByID(CuaHangDTO id) {
        CuaHang cuaHang;
        try (Session session = DuongUtil.getFactory().openSession()) {
            Query<CuaHang> query = session.createQuery("select CuaHang from CuaHang where CuaHang.id = :id", CuaHang.class);
        }
        return null;
    }

    @Override
    public CuaHang save(CuaHang cuaHang) {
 try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(cuaHang);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                cuaHang = null;
            }

        } finally {
            return cuaHang;
        }  
    }

    @Override
    public boolean delete(String id) {
 try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                Query query = session.createQuery("DELETE CuaHang ms WHERE ms.id = :id");
                query.setParameter("id", id);
                int result = query.executeUpdate();
                if (result == 0) {
                    return true;
                }
                trans.commit();
            } catch (Exception e) {
                return false;
            }
            return true;
        }    
    }

    @Override
    public void save(String id, String ma, String ten, String DiaChi, String ThanhPho, String QuocGia) {

    }

}

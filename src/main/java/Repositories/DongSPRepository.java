/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Dto.DongSPDTO;
import Entities.CuaHang;
import Entities.DongSP;
import Utilities.DuongUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hrska
 */
public class DongSPRepository implements IDongSPRepository {

    @Override
    public List<DongSP> findAll() {
        List<DongSP> dongSP;
        try (Session session = DuongUtil.getFactory().openSession()) {
            org.hibernate.query.Query<DongSP> query = session.createQuery("FROM DongSP ", DongSP.class);
            dongSP = query.getResultList();
        }
        return dongSP;
    }

    @Override
    public DongSP findById(DongSPDTO id) {
 CuaHang cuaHang;
        try (Session session = DuongUtil.getFactory().openSession()) {
            org.hibernate.query.Query<DongSP> query = session.createQuery("select DongSP from DongSP where DongSP.id = :id", DongSP.class);
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                org.hibernate.query.Query query = session.createQuery("DELETE DongSP ms WHERE ms.id = :id");
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
    public DongSP save(DongSP dongSP) {
    try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(dongSP);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                dongSP = null;
            }

        } finally {
            return dongSP;
        }  
    }

}

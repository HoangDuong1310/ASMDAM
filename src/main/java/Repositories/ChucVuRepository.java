/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.ChucVu;
import Utilities.DuongUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



/**
 *
 * @author hrska
 */
public class ChucVuRepository implements IChucVuRepository{

    @Override
    public List<ChucVu> findAll() {
List<ChucVu> chucVu;
 try(Session session = DuongUtil.getFactory().openSession()){
            Query<ChucVu> query = session.createQuery("FROM ChucVu ", ChucVu.class);
            chucVu = query.getResultList();
        }
        return chucVu;
    }

    @Override
    public ChucVu findByID(String id) {
  ChucVu chucVu;
        try(Session session = DuongUtil.getFactory().openSession()){
            Query<ChucVu> query = session.createQuery("select ChucVu from ChucVu where ChucVu.id = :id", ChucVu.class);
        }
        return null;
    }

    @Override
    public ChucVu save(ChucVu chucVu) {
     try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(chucVu);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                chucVu = null;
            }

        } finally {
            return chucVu;
        }  
    }

    @Override
    public boolean delete(String id) {
    try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                Query query = session.createQuery("DELETE ChucVu ms WHERE ms.id = :id");
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
    public void save(String id, String ma, String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    
}

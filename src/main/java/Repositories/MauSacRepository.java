package Repositories;

import Entities.MauSac;
import Utilities.DuongUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import org.hibernate.Transaction;

public class MauSacRepository implements IMauSacRepository{
    @Override
    public List<MauSac> findAll() {
        List<MauSac> mauSac;
        try(Session session = DuongUtil.getFactory().openSession()){
            Query<MauSac> query = session.createQuery("FROM MauSac ", MauSac.class);
            mauSac = query.getResultList();
        }
        return mauSac;
    }

    @Override
    public MauSac findByID(String id) {
        MauSac mauSac;
        try(Session session = DuongUtil.getFactory().openSession()){
            Query<MauSac> query = session.createQuery("select MauSac from MauSac where MauSac.id = :id", MauSac.class);
        }
        return null;
    }

    @Override
    public MauSac save(MauSac mauSac) {
         try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(mauSac);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                mauSac = null;
            }

        } finally {
            return mauSac;
        }
    }

    @Override
    public boolean delete(String id) {
       try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                Query query = session.createQuery("DELETE MauSac ms WHERE ms.id = :id");
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

    }
}

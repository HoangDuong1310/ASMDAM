/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.ProductS;
import Utilities.DuongUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Duong
 */
public class ProductSRepository implements IProductSRepository {

    @Override
    public List<ProductS> findAll() {
        List<ProductS> products;
        try (Session session = DuongUtil.getFactory().openSession()) {
            String hql = "FROM ProductS";
            Query<ProductS> query = session.createQuery(hql, ProductS.class);
            products = query.getResultList();
        }
        return products;

    }

    @Override
    public ProductS findByID(String id) {
        ProductS productS;
        try (Session session = DuongUtil.getFactory().openSession()) {
            String hql = "SELECT p FROM ProductS p WHERE p.id = :id";
            Query<ProductS> query = session.createQuery(hql, ProductS.class);
            query.setParameter("id", id);
            productS = query.getSingleResult();
        }
        return productS;
    }

    @Override
    public ProductS save(ProductS productS) {
        try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(productS);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                productS = null;
            }

        } finally {
            return productS;
        }

    }

    @Override
    public boolean delete(String id) {
        try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                Query query = session.createQuery("DELETE ProductS p WHERE p.id = :id");
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

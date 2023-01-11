/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;


import DomainModels.Category;
import Utilities.DuongUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author PTPM
 */
public class CategoryRepository implements ICategoryRepository {

    @Override
    public List<Category> findAll() {
        List<Category> categories;
        Session session = DuongUtil.getFactory().openSession();
        String hql = "SELECT c FROM Category c";
        Query<Category> query = session.createQuery(hql, Category.class);
        categories = query.getResultList();
        return categories;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.KhachHang;
import Entities.MauSac;
import Utilities.DuongUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author hrska
 */
public class KhachHangRepository implements IKhachHangRepository {

    @Override
    public List<KhachHang> findAll() {
        List<KhachHang> khachHang;
        try (Session session = DuongUtil.getFactory().openSession()) {
            Query<KhachHang> query = session.createQuery("FROM KhachHang ", KhachHang.class);
            khachHang = query.getResultList();
        }
        return khachHang;
    }

    @Override
    public KhachHang findById(String id) {
        KhachHang khachHang;
        try (Session session = DuongUtil.getFactory().openSession()) {
            Query<KhachHang> query = session.createQuery("select KhachHang from KhachHang where KhachHang.id = :id ", KhachHang.class);
        }
        return null;
    }

    @Override
    public KhachHang save(KhachHang khachHang) {
try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(khachHang);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                khachHang = null;
            }

        } finally {
            return khachHang;
        }
    }

    @Override
    public boolean delete(String id) {
 try (Session session = DuongUtil.getFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                Query query = session.createQuery("DELETE KhachHang kh WHERE kh.id = :id");
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
    public void save1(String id, String ma, String ten, String tenDem, String ho, Date ngaySinh, String sdt, String diaChi, String thanhPho, String quocGia, String matKhau) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

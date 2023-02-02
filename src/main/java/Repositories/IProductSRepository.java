/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Entities.Product;
import java.util.List;

/**
 *
 * @author Duong
 */
public interface IProductSRepository {

    List<Product> findAll();

    Product findByID(String id);

    Product save(Product productS);

    boolean delete(String id);

    public void save(String id, String ma, String ten);

}

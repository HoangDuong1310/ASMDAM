/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ProductS;
import java.util.List;

/**
 *
 * @author Duong
 */
public interface IProductSRepository {

    List<ProductS> findAll();

    ProductS findByID(String id);

    ProductS save(ProductS productS);

    String delete(String id);

    public void save(String id, String ma, String ten);

}

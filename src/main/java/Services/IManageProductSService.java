/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.FromProduct;
import java.util.List;

/**
 *
 * @author Duong
 */
public interface IManageProductSService {
    List<FromProduct> getProducts();
    FromProduct getProductById(String id);
    FromProduct createNewProduct(FromProduct product);
    FromProduct updateProductById(FromProduct product);
    String deleteProductById(String id);
}

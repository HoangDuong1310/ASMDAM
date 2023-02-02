/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Dto.ProductDTO;
import java.util.List;

/**
 *
 * @author Duong
 */
public interface IProductService {
    List<ProductDTO> getProducts();
    ProductDTO getProductById(String id);
    ProductDTO createNewProduct(ProductDTO product);
    ProductDTO updateProductById(ProductDTO product);
    boolean deleteProductById(String id);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Product;
import Repositories.IProductSRepository;
import Repositories.ProductSRepository;
import Dto.ProductDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duong
 */
public class ProductService implements IProductService {

    private final IProductSRepository _IProductSRepository;
    private List<ProductDTO> _FromProduct;

    public ProductService() {
        _IProductSRepository = (IProductSRepository) new ProductSRepository();
        _FromProduct = new ArrayList<>();
    }

    @Override
    public List<ProductDTO> getProducts() {
        _FromProduct = new ArrayList<>();
        var product = _IProductSRepository.findAll();
        for (Product x : product) {
            _FromProduct.add(new ProductDTO(x.getId(), x.getMa(), x.getTen()));
        }
        return _FromProduct;
    }

    @Override
    public ProductDTO getProductById(String id) {
        var x = _IProductSRepository.findByID(id);
        return new ProductDTO(x.getId(), x.getMa(), x.getTen());
    }

    @Override
    public ProductDTO createNewProduct(ProductDTO product) {
        product.setId(null);
        var x = _IProductSRepository.save(new Product(product.getId(), product.getMa(), product.getTen()));
        return new ProductDTO(x.getId(), x.getMa(), x.getTen());
    }

    @Override
    public ProductDTO updateProductById(ProductDTO product) {
        var x = _IProductSRepository.save(new Product(product.getId(), product.getMa(), product.getTen()));
        return new ProductDTO(x.getId(), x.getMa(), x.getTen());
    }

    @Override
    public boolean deleteProductById(String id) {
        return _IProductSRepository.delete(id);
    }

}

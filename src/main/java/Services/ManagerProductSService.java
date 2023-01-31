/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.ProductS;
import Repositories.IProductSRepository;
import Repositories.ProductSRepository;
import Dto.FromProduct;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duong
 */
public class ManagerProductSService implements IManageProductSService {

    private final IProductSRepository _IProductSRepository;
    private List<FromProduct> _FromProduct;

    public ManagerProductSService() {
        _IProductSRepository = (IProductSRepository) new ProductSRepository();
        _FromProduct = new ArrayList<>();
    }

    @Override
    public List<FromProduct> getProducts() {
        _FromProduct = new ArrayList<>();
        var product = _IProductSRepository.findAll();
        for (ProductS x : product) {
            _FromProduct.add(new FromProduct(x.getId(), x.getMa(), x.getTen()));
        }
        return _FromProduct;
    }

    @Override
    public FromProduct getProductById(String id) {
        var x = _IProductSRepository.findByID(id);
        return new FromProduct(x.getId(), x.getMa(), x.getTen());
    }

    @Override
    public FromProduct createNewProduct(FromProduct product) {
        product.setId(null);
        var x = _IProductSRepository.save(new ProductS(product.getId(), product.getMa(), product.getTen()));
        return new FromProduct(x.getId(), x.getMa(), x.getTen());
    }

    @Override
    public FromProduct updateProductById(FromProduct product) {
        var x = _IProductSRepository.save(new ProductS(product.getId(), product.getMa(), product.getTen()));
        return new FromProduct(x.getId(), x.getMa(), x.getTen());
    }

    @Override
    public boolean deleteProductById(String id) {
        return _IProductSRepository.delete(id);
    }

}

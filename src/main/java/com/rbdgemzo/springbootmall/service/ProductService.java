package com.rbdgemzo.springbootmall.service;

import com.rbdgemzo.springbootmall.dto.ProductRequest;
import com.rbdgemzo.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

package com.rbdgemzo.springbootmall.dao;

import com.rbdgemzo.springbootmall.dto.ProductRequest;
import com.rbdgemzo.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

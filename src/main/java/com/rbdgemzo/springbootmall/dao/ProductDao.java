package com.rbdgemzo.springbootmall.dao;

import com.rbdgemzo.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}

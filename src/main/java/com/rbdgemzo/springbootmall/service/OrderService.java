package com.rbdgemzo.springbootmall.service;

import com.rbdgemzo.springbootmall.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

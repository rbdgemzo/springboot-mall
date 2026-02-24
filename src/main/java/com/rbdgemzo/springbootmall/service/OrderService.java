package com.rbdgemzo.springbootmall.service;

import com.rbdgemzo.springbootmall.dto.CreateOrderRequest;
import com.rbdgemzo.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

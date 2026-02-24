package com.rbdgemzo.springbootmall.service;

import com.rbdgemzo.springbootmall.dto.CreateOrderRequest;
import com.rbdgemzo.springbootmall.dto.OrderQueryParams;
import com.rbdgemzo.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Integer orderId);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

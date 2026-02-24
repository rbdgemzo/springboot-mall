package com.rbdgemzo.springbootmall.dao;

import com.rbdgemzo.springbootmall.dto.OrderQueryParams;
import com.rbdgemzo.springbootmall.model.Order;
import com.rbdgemzo.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Order getOrderById(Integer orderId);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}

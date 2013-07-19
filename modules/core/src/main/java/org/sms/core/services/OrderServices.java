package org.sms.core.services;

import org.sms.models.Order;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderServices {

    Order saveOrders(Order order);

    void deleteOrders(Order order);

    Order findOrders(Long id);

    List<Order> findAllOrders();

    Page<Order> findAllOrders(int page, int size);
}

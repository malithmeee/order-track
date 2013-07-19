package org.sms.core.services.impl;

import org.sms.core.services.OrderServices;
import org.sms.models.Order;
import org.sms.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@Service("orderServices")
@ContextConfiguration(locations = "classpath:META-INF/application-context.xml")
public class OrderServiceImpl implements OrderServices {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrders(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrders(Order order) {
        orderRepository.delete(order);
    }

    public Order findOrders(Long id) {
        return orderRepository.findOne(id);
    }

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Page<Order> findAllOrders(int page, int size) {
        return orderRepository.findAll(new PageRequest(page, size));
    }
}
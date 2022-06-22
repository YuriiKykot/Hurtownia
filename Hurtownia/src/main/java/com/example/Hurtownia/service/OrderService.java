package com.example.Hurtownia.service;

import com.example.Hurtownia.entity.Order;
import com.example.Hurtownia.enums.OrderStatus;
import com.example.Hurtownia.repository.ClientRepository;
import com.example.Hurtownia.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ClientRepository clientRepository;

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public void cancelOrder(Long idOrder){
        Order order = orderRepository.findById(idOrder).orElse(null);
        order.setOrderStatus(OrderStatus.CANCELED);
        orderRepository.save(order);
    }

    public List<Order> getAllSubmitted() {
        return orderRepository.findAllByOrderStatus(OrderStatus.SUBMITTED);
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public List<Order> getAllOnTheWay() {
        return orderRepository.findAllByOrderStatus(OrderStatus.ONTHEWAY);
    }
}

package com.example.Hurtownia.service;

import com.example.Hurtownia.entity.Deliverer;
import com.example.Hurtownia.entity.Order;
import com.example.Hurtownia.enums.DelivererStatus;
import com.example.Hurtownia.enums.OrderStatus;
import com.example.Hurtownia.repository.DelivererRepository;
import com.example.Hurtownia.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DelivererService {
    @Autowired
    DelivererRepository delivererRepository;

    @Autowired
    OrderRepository orderRepository;

    public List<Deliverer> getAllDeliverersFree() {
        return delivererRepository.findAllByDelivererStatus(DelivererStatus.FREE);
    }

    public List<Deliverer> getAll() {
        return delivererRepository.findAll();
    }

    public Deliverer addDeliverer(Deliverer deliverer){
        return delivererRepository.save(deliverer);
    }

    public Deliverer addOrder(String idD, String idO){
        Long idDeliverer = Long.parseLong(idD);
        Long idOrder = Long.parseLong(idO);
        Deliverer deliverer = delivererRepository.findById(idDeliverer).orElse(null);
        Order order = orderRepository.findById(idOrder).orElse(null);
        if(deliverer != null && order != null){
            order.setDeliverer(deliverer);
            order.setOrderStatus(OrderStatus.ONTHEWAY);
            List<Order> orderList = deliverer.getOrders();
            orderList.add(order);
            deliverer.setOrders(orderList);
            deliverer.setDelivererStatus(DelivererStatus.BUSY);
            delivererRepository.save(deliverer);
            orderRepository.save(order);
            return deliverer;
        }
        return null;
    }
}

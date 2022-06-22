package com.example.Hurtownia.controller;

import com.example.Hurtownia.entity.Order;
import com.example.Hurtownia.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("/cancelOrder/{id}")
    public void cancelOrder(@PathVariable Long id){
        orderService.cancelOrder(id);
    }

    @GetMapping("returnTo")
    public void returnTo(){}

    @GetMapping("/getSubmitted")
    public List<Order> getAllProcessing(){
        return orderService.getAllSubmitted();
    }

    @GetMapping("/getAll")
    public List<Order> getAll(){
        return orderService.getAll();
    }

    @GetMapping("/getAllOnTheWay")
    public List<Order> getAllOnTheWay(){
        return orderService.getAllOnTheWay();
    }
}

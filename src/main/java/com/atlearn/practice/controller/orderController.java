package com.atlearn.practice.controller;

import com.atlearn.practice.entity.Orders;
import com.atlearn.practice.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class orderController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/orders/saveOrder")
    public void addOrders(Orders orders){
        ordersService.addOrder(orders);
    }

    @GetMapping("/orders/getOrsers")
    public Orders getOrders(String id){
       return ordersService.selectOrderById(id);
    }

    @PostMapping("/orders/deleteOrders")
    public void deleteOrders(Orders orders){
        ordersService.deleteOrderById(orders);
    }

    @PostMapping("/orders/updateOrders")
    public void updateOrders(Orders orders){
        ordersService.update(orders);
    }
}

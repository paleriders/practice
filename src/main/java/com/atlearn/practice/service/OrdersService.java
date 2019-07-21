package com.atlearn.practice.service;
import com.atlearn.practice.entity.Orders;
import com.atlearn.practice.entity.Result;
import com.atlearn.practice.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrdersService {

    @Autowired
    private OrderRepo orderRepo;

    public void addOrder(Orders orders){
        orderRepo.save(orders);
    }

    public Orders selectOrderById(String id){
        return orderRepo.getOne(id);
    }

    public void deleteOrderById(Orders orders){
        orders.setActive(false);
        orderRepo.save(orders);
    }

    public void update(Orders orders){
        orderRepo.save(orders);
    }
}
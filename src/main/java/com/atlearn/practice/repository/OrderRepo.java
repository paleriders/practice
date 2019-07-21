package com.atlearn.practice.repository;


import com.atlearn.practice.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepo  extends JpaRepository<Orders,String> {
//    @Query(value = "update  Orders set Orders.active=false where Orders.id=#{id}")
//     void deleteOrdersByOrderId();
}

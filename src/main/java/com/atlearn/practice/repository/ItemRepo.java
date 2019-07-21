package com.atlearn.practice.repository;


import com.atlearn.practice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item,String> {
//    @Query(value = "update Item set active=1 where itemCode=?1")
    void deleteByItemCode(String ItemCode);

    Item findItemByItemCode(String itemCode);
}

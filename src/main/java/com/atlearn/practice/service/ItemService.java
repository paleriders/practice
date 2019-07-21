package com.atlearn.practice.service;

import com.atlearn.practice.entity.Item;
import com.atlearn.practice.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public Item selectItemCode(String itemCode){
        return itemRepo.findItemByItemCode(itemCode);
    }

    public void saveItem(Item item){
        itemRepo.save(item);
    }
    public void deleteItem(String itemCode){
        itemRepo.deleteByItemCode(itemCode);
    }
}

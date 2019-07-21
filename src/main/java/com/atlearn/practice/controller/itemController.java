package com.atlearn.practice.controller;

import com.atlearn.practice.entity.Item;
import com.atlearn.practice.entity.Result;
import com.atlearn.practice.enums.ResultEnum;
import com.atlearn.practice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class itemController {

    @Autowired
    private  ItemService itemService;

    @PostMapping("/Item/saveItem")
    public void insertItem(Item item){
        itemService.saveItem(item);
    }

    @GetMapping("/item/selectByCode")
    public Item select(String itemCode){
        return itemService.selectItemCode(itemCode);
    }

    @DeleteMapping("/Item/deleteItem")
    public Result deleteItem(String itemCode){
        itemService.deleteItem(itemCode);
        return new Result(ResultEnum.ok);
    }
}

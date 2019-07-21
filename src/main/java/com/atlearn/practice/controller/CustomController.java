package com.atlearn.practice.controller;


import com.atlearn.practice.entity.Customer;
import com.atlearn.practice.entity.Result;
import com.atlearn.practice.repository.CoustomRepo;
import com.atlearn.practice.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CustomController {
    @Autowired
    CoustomRepo coustomRepo;

    @Autowired
    CustomService customService;


    @GetMapping("/customer/selectCoustomByCustomcode")
    public Customer findCoustomByCustomCode(String customCode){
        return customService.getCustom(customCode);
    }

    @GetMapping("/customer/select")
    public Result<Customer> find(String customCode){
        return customService.getCustomer(customCode);
    }



    @PostMapping("/customer/saveCustom")
    public void saveCustom(Customer customDto){
         customService.save(customDto);
    }

    @PostMapping("/customer/deleteCustomById")
    public void deleteCustomById(String id){
        customService.deleteCustomById(id);
    }

    @GetMapping("/customer/findAll")
    public List<Customer> findAll(){
        return customService.findAll();
    }



}

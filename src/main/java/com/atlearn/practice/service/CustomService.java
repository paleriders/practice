package com.atlearn.practice.service;


import com.atlearn.practice.Dto.CustomerDto;
import com.atlearn.practice.entity.Customer;
import com.atlearn.practice.entity.Result;
import com.atlearn.practice.repository.CoustomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomService {

    @Autowired
    private CoustomRepo coustomRepo;


    public Customer getCustom(String customCode){
        Customer coustom=coustomRepo.findAllByCustomCode(customCode);
        return coustom;
    }
    public Result<Customer> getCustomer(String customCode){
        Customer customer=coustomRepo.getOne(customCode);
        System.out.println(customer);
        return new Result<Customer>().success(customer);
    }

    public void save(Customer customer){
        coustomRepo.save(customer);
    }

    public List<Customer> findAll(){
        List<Customer>  customerList = new ArrayList<Customer>();
        coustomRepo.findAll();
        return customerList;
    }

    public void deleteCustomById(String id){
        coustomRepo.deleteById(id);
    }

}

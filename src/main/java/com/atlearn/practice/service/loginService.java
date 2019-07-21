package com.atlearn.practice.service;

import com.atlearn.practice.entity.Result;
import com.atlearn.practice.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginService {
    @Autowired
    private  PersonRepo personRepo;

    public Result login(){

        return null;
    }
}

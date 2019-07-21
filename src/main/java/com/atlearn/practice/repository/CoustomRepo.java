package com.atlearn.practice.repository;

import com.atlearn.practice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoustomRepo extends JpaRepository<Customer,String>  {

     Customer findCoustomByCustomCode(String CustomCode);

     Customer findAllByCustomCode(String CustomCode);
}

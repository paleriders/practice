package com.atlearn.practice.service;

import com.atlearn.practice.entity.Person;
import com.atlearn.practice.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public List<Person> findAll() {
        List<Person> list = personRepo.findAll();
//        personRepo.findById()
        return list;
    }
    public void save(Person person){
        Person p = personRepo.getOne("402886106b7a27f5016b7a2989a30000");
        p.setPassword(null);
        personRepo.save(p);

    }
}

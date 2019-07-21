package com.atlearn.practice.controller;
import com.atlearn.practice.entity.Person;
import com.atlearn.practice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping("/person/select")
    public List<Person> select(String id){
        System.out.println(id);
        return personService.findAll();
    }
    @PostMapping("/person/save")
    public String add(Person person){
        personService.save(person);
        return "ok";
    }
}

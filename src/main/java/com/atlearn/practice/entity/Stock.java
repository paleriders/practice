package com.atlearn.practice.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@GenericGenerator(name = "jpa-uuid" ,strategy = "uuid")
public class Stock {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    private String itemCode;

    private String itemStock;

}

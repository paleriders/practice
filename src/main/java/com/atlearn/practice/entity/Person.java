package com.atlearn.practice.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Person {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    private String password;
    private String userName;
    @Version
    private int version;


}

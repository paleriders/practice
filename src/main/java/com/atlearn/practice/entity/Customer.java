package com.atlearn.practice.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@GenericGenerator(name = "jpa-uuid" ,strategy="uuid")
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(generator="jpa-uuid")
    private String Id;

    private String customCode;

    private String customName;

    private String customAddress;

    private String customPhone;

    private String customMessage;

}

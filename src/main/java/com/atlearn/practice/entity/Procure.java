package com.atlearn.practice.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class Procure {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String Id;

    private String procureCode;

    private String procureName;

    private String procureType;

    private Integer procureNumber;

    private Date createDate;

    private  Date lastModifiedDate;

    private String procurePersonCode;

    private  String procursMessage;

}

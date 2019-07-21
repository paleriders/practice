package com.atlearn.practice.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class DeliverItem extends BaseEntity {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String Id;

    private String deliverCode;

    private String deliverName;

    private LocalDate createDate;

    private LocalDate lastModifiedDate;
}

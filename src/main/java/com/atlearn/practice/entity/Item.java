package com.atlearn.practice.entity;

import com.atlearn.practice.enums.ItemUnit;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;

@Data
@Entity
@GenericGenerator(name = "jpa-uuid", strategy= "uuid")
public class Item extends BaseEntity{
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    private String itemCode;

    private String itemName;

    @Enumerated(EnumType.STRING)
    private ItemUnit itemUnit;

    private String itemType;

    private float itemPrice;

    private String itemMessage;


}

package com.atlearn.practice.entity;
import com.atlearn.practice.enums.OrderStatus;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Entity
public class Orders extends BaseEntity{

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String Id;

    private String orderCode;

    private String orderName;

    private String orderType;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToOne
    private Item item;

    @ManyToOne
    private Customer custom;

}

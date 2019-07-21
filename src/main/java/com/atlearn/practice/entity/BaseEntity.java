package com.atlearn.practice.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    private LocalDate updateTime;

    @Type(type="true_false")
    private boolean active;
}

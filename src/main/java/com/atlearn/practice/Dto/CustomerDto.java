package com.atlearn.practice.Dto;


import lombok.Data;

@Data
public class CustomerDto {
    private String Id;

    private String customCode;

    private String customName;

    private String customAddress;

    private String customPhone;

    private String customMessage;
}

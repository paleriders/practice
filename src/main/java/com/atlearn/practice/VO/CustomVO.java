package com.atlearn.practice.VO;


import lombok.Data;

import java.util.Date;

@Data
public class CustomVO {
    private String customCode;

    private String customName;

    private String customAddress;

    private String customPhone;

    private String customMessage;

    private Date createDate;

    private Date modifiedDate;

}

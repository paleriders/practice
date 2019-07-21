package com.atlearn.practice.enums;

import java.util.EnumSet;

public enum  OrderStatus {
    OrderAccept,OrderUnreceived;

    public EnumSet<OrderStatus> getOrderStatusAll(){
        return  EnumSet.allOf(OrderStatus.class);
    }
}

package com.roro.msproviderorder.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderVo {

    private Integer orderId;

    private BigDecimal orderMoney;

    private Integer userId;

    private String dbSource;


}

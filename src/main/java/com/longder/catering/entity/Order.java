package com.longder.catering.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单
 */
@Data
public class Order extends BaseEntity{
    /**
     * 支付方式
     */
    private String payment;
    /**
     * 地址
     */
    private String address;
    /**
     * 总金额
     */
    private BigDecimal amount;
    /**
     * 订单状态
     */
    private String status;
    /**
     * 备注
     */
    private String remake;
}

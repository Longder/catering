package com.longder.catering.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 菜品
 */
@Data
public class Dish extends BaseEntity{
    /**
     * 名称
     */
    private String name;

    private String type;

    private String description;
    private BigDecimal money;

    private String imageUrl;
}

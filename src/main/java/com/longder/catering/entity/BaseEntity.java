package com.longder.catering.entity;

import lombok.Data;

import java.io.Serializable;

@Data
class BaseEntity implements Serializable {
    /**
     * 主键
     */
    private Long id;
}

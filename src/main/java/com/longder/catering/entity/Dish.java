package com.longder.catering.entity;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

/**
 * 菜品
 */
@Data
public class Dish extends BaseEntity {
    /**
     * 名称
     */
    private String name;
    /**
     * 类型
     */
    private String type;
    /**
     * 描述
     */
    private String description;
    /**
     * 金额
     */
    private BigDecimal money;
    /**
     * 图片路径
     */
    private String imageUrl;
    /**
     * 有效性
     */
    private Boolean enabled = true;
    /**
     * 上传的文件
     */
    private MultipartFile file;
}

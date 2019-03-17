package com.longder.catering.entity;

import lombok.Data;
import java.util.List;

/**
 * 系统用户
 */
@Data
public class SysUser extends BaseEntity {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 有效性
     */
    private Boolean enabled = true;
    /**
     * 用户角色
     */
    private List<SysRole> roleList;
}

package com.longder.catering.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;

/**
 * 系统角色
 */
public enum SysRole implements GrantedAuthority {
    ROLE_ADMIN("ROLE_ADMIN","管理员"),
    ROLE_USER("ROLE_USER","会员"),
    ROLE_DELIVER("ROLE_DELIVER","送餐员");

    private String name;
    private String displayName;

    SysRole(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    @Override
    public String getAuthority() {
        return this.name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public static SysRole getRole(String databaseValue){
        return Arrays.stream(SysRole.values()).filter(sysRole -> sysRole.getName().equals(databaseValue)).findFirst().orElse(null);
    }
}

package com.longder.catering.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;

/**
 * 系统角色
 */
public enum SysRole implements GrantedAuthority {
    ROLE_ADMIN("ROLE_ADMIN","管理员","label-danger"),
    ROLE_USER("ROLE_USER","会员","label-primary"),
    ROLE_DELIVER("ROLE_DELIVER","送餐员","label-success");

    private String name;
    private String displayName;
    private String label;

    SysRole(String name, String displayName, String label) {
        this.name = name;
        this.displayName = displayName;
        this.label = label;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static SysRole getRole(String databaseValue){
        return Arrays.stream(SysRole.values()).filter(sysRole -> sysRole.getName().equals(databaseValue)).findFirst().orElse(null);
    }
}

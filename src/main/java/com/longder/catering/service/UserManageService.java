package com.longder.catering.service;

import com.longder.catering.entity.SysUser;

import java.util.List;

/**
 * Created by Longder
 */
public interface UserManageService {
    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> listUsers();
}

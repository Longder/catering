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

    /**
     * 用户民是否存在
     * @param username
     * @return
     */
    boolean isUsernameExist(String username);

    /**
     * 添加一个用户
     */
    void addUser(SysUser sysUser);

    /**
     * 查询一个用户
     * @param userId
     * @return
     */
    SysUser getOne(Long userId);
}

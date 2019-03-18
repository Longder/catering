package com.longder.catering.service.impl;

import com.longder.catering.entity.SysUser;
import com.longder.catering.repository.SysUserRepository;
import com.longder.catering.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Longder
 */
@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    private SysUserRepository sysUserRepository;

    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<SysUser> listUsers() {
        List<SysUser> list = sysUserRepository.selectAllUsers();
        list.forEach(sysUser -> sysUser.setRole(sysUserRepository.selectRolesByUserId(sysUser.getId()).get(0)));
        return list;
    }
}

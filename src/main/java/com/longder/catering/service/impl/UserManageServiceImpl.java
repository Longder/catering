package com.longder.catering.service.impl;

import com.longder.catering.entity.SysUser;
import com.longder.catering.repository.SysUserRepository;
import com.longder.catering.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 用户民是否存在
     *
     * @param username
     * @return
     */
    @Override
    public boolean isUsernameExist(String username) {
        return !ObjectUtils.isEmpty(sysUserRepository.selectByUserName(username));
    }

    /**
     * 添加一个用户
     *
     * @param sysUser
     */
    @Override
    @Transactional
    public void addUser(SysUser sysUser) {
        sysUserRepository.insertOne(sysUser);
        //处理用户角色
        Map<String,Object> map = new HashMap<>();
        map.put("userId",sysUser.getId());
        map.put("roleName",sysUser.getRole().getName());
        sysUserRepository.insertOneRole(map);
    }

    /**
     * 查询一个用户
     *
     * @param userId
     * @return
     */
    @Override
    public SysUser getOne(Long userId) {
        SysUser sysUser = sysUserRepository.selectById(userId);
        sysUser.setRole(sysUserRepository.selectRolesByUserId(userId).get(0));
        return sysUser;
    }
}

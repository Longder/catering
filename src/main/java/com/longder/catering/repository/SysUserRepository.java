package com.longder.catering.repository;

import com.longder.catering.entity.SysRole;
import com.longder.catering.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SysUserRepository {

    void insertOne(SysUser sysUser);

    void insertOneRole(Map<String,Object> map);

    SysUser selectByUserName(String userName);

    List<SysRole> selectRolesByUserId(Long userId);

    List<SysUser> selectAllUsers();

    SysUser selectById(Long id);
}

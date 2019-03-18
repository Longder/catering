package com.longder.catering.repository;

import com.longder.catering.BaseTest;
import com.longder.catering.entity.SysRole;
import com.longder.catering.entity.SysUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class SysUserRepositoryTest extends BaseTest {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Test
    public void testInsertOne(){
        SysUser sysUser = new SysUser();
        sysUser.setUserName("admin");
        sysUser.setPassword("1234");
        sysUser.setPhone("13629421675");
        sysUserRepository.insertOne(sysUser);
    }

    @Test
    public void testSelectByUserName(){
        String userName = "admin";
        SysUser sysUser = sysUserRepository.selectByUserName(userName);
        System.out.println(sysUser);
    }

    @Test
    public void testSelectRoles(){
        Long userId = 1L;
        List<SysRole> roleList = sysUserRepository.selectRolesByUserId(userId);
        System.out.println(roleList.size());
    }

    @Test
    public void testSelectById(){
        Long userId = 1L;
        SysUser sysUser = sysUserRepository.selectById(userId);
        Assert.assertEquals("admin",sysUser.getUserName());
    }
}

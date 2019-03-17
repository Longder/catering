package com.longder.catering.security;

import com.longder.catering.entity.SysRole;
import com.longder.catering.entity.SysUser;
import com.longder.catering.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.ObjectUtils;

import java.util.List;


public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepository.selectByUserName(s);
        if(ObjectUtils.isEmpty(sysUser)){
            throw new UsernameNotFoundException("用户名不存在");
        }
        //查询用户角色
        List<SysRole> roles = sysUserRepository.selectRolesByUserId(sysUser.getId());
        return new User(sysUser.getUserName(),sysUser.getPassword(),roles);
    }
}

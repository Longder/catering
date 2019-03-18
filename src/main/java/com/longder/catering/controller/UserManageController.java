package com.longder.catering.controller;

import com.longder.catering.entity.SysUser;
import com.longder.catering.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户管理相关业务的控制器
 */
@Controller
@RequestMapping("/admin/user")
public class UserManageController {
    @Autowired
    private UserManageService userManageService;

    @GetMapping("/list")
    public String userList(Model model){
        model.addAttribute("userList",userManageService.listUsers());
        return "admin/user/list";
    }

    @GetMapping("/toAdd")
    public String toAddUser(){
        return "admin/user/add";
    }

    @PostMapping("/add")
    public String addUser(SysUser sysUser){
        userManageService.addUser(sysUser);
        return "redirect:list";
    }

    @ResponseBody
    @PostMapping("/checkUsername")
    public boolean checkUsername(String username){
        return userManageService.isUsernameExist(username);
    }

    @GetMapping("/toUpdate")
    public String toUpdateUser(Long userId,Model model){
        model.addAttribute("sysUser",userManageService.getOne(userId));
        return "admin/user/update";
    }
}

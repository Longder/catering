package com.longder.catering.controller;

import com.longder.catering.entity.SysUser;
import com.longder.catering.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 管理员操作的Controller
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserManageService userManageService;

    @RequestMapping("/index")
    public String index(){
        return "admin/admin-index";
    }

    @RequestMapping("/dashboard")
    public String dashboard(){
        return "admin/dashboard";
    }


}

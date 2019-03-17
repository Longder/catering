package com.longder.catering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 管理员操作的Controller
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/detail")
    public String testDetail(){
        return "admin/detail";
    }
}

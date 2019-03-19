package com.longder.catering.controller;

import com.longder.catering.service.DishManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Longder
 */
@Controller
@RequestMapping("/admin/dish")
public class DishManageController {

    @Autowired
    private DishManageService dishManageService;

    @GetMapping("/list")
    public String listDishes(Model model){

        return "admin/dish/list";
    }

}

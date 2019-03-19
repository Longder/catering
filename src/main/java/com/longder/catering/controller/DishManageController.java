package com.longder.catering.controller;

import com.longder.catering.entity.Dish;
import com.longder.catering.service.DishManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
        model.addAttribute("dishes",dishManageService.listDishes());
        return "admin/dish/list";
    }
    @GetMapping("/toAdd")
    public String toAddDish(){
        return "admin/dish/add";
    }

    @PostMapping("/add")
    public String addDish(Dish dish){
        dishManageService.addDish(dish);
        return "redirect:list";
    }

}

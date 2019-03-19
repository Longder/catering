package com.longder.catering.service;

import com.longder.catering.entity.Dish;

import java.util.List;

/**
 * Created by Longder
 */
public interface DishManageService {

    List<Dish> listDishes();

    /**
     * 添加一个菜品
     * @param dish
     */
    void addDish(Dish dish);
}

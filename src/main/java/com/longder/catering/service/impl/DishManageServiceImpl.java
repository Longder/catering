package com.longder.catering.service.impl;

import com.longder.catering.entity.Dish;
import com.longder.catering.repository.DishRepository;
import com.longder.catering.service.DishManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Longder
 */
@Service
public class DishManageServiceImpl implements DishManageService {
    @Autowired
    private DishRepository dishRepository;

    @Override
    public List<Dish> listDishes() {
        return dishRepository.selectAll();
    }
}

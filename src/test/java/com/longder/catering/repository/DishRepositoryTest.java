package com.longder.catering.repository;

import com.longder.catering.BaseTest;
import com.longder.catering.entity.Dish;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;


/**
 * Created by Longder
 */
public class DishRepositoryTest extends BaseTest {

    @Autowired
    private DishRepository dishRepository;

    @Test
    public void testInsert(){
        Dish dish = new Dish();
        dish.setName("黄金至尊披萨");
        dish.setDescription("我是描述");
        dish.setType("主食");
        dish.setMoney(new BigDecimal(25));
        dish.setImageUrl("testUrl");
        dishRepository.insertOne(dish);
        Assert.assertNotNull(dish.getId());

    }
}

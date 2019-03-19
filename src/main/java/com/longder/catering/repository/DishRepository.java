package com.longder.catering.repository;

import com.longder.catering.entity.Dish;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Longder
 */
@Repository
public interface DishRepository {

    List<Dish> selectAll();

    void insertOne(Dish dish);
}

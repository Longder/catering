package com.longder.catering.service.impl;

import com.longder.catering.entity.Dish;
import com.longder.catering.repository.DishRepository;
import com.longder.catering.service.DishManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

/**
 * Created by Longder
 */
@Service
public class DishManageServiceImpl implements DishManageService {
    @Autowired
    private DishRepository dishRepository;
    /**
     * 文件上传的文件夹
     */
    @Value("${system.upload-dir}")
    private String uploadDir;

    @Override
    public List<Dish> listDishes() {
        return dishRepository.selectAll();
    }

    /**
     * 添加一个菜品
     *
     * @param dish
     */
    @Override
    @Transactional
    public void addDish(Dish dish) {
        //先存dish
        MultipartFile file = dish.getFile();
        byte[] bytes;
        try {
            bytes = file.getBytes();
            //拼一个uuid
            Path path = Paths.get(uploadDir + UUID.randomUUID().toString()+file.getOriginalFilename());
            Files.write(path, bytes);
            dish.setImageUrl(path.toString());
            dishRepository.insertOne(dish);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

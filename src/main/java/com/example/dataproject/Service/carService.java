package com.example.dataproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dataproject.Entity.car;
import com.example.dataproject.Mapper.carMapper;

@Service
public class carService {
    carMapper carMapper;

    @Autowired
    public carService(carMapper carMapper) {
        this.carMapper = carMapper;
    }

    public List<car> getAllYourEntities() {
        return carMapper.getAllYourEntities();
    }

}

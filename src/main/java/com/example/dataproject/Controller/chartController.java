package com.example.dataproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dataproject.Service.carService;

import org.springframework.web.bind.annotation.RequestMapping;
import com.example.dataproject.Entity.car;


@Controller
@RequestMapping("/chart")
public class chartController {

    carService carService;

    @Autowired
    public chartController(carService carService) {
        this.carService = carService;
    }
    
    @GetMapping("/car")
    public String car(Model model) {
        List<car> car = carService.getAllYourEntities();
        model.addAttribute("car", car);

        return"car";
    }
        
}

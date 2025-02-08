package com.example.Meals.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealController {
    @GetMapping
    public List<String> getMeals(){
        return List.of("Pasta", "Pizza", "Salad");

    }
}

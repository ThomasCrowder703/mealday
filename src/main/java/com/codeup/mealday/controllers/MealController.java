package com.codeup.mealday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MealController {

    @GetMapping("/create")
    public String mealPage(){

        return "meal";
    }


}


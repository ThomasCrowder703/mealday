package com.codeup.mealday.controllers;

import com.codeup.mealday.models.Meal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MealController {

    @GetMapping("/create")
    public String mealPage(){

        return "meal";
    }

    @PostMapping("/create")
    @ResponseBody
    public String saveMeal(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "ingredients") String ingredients
            ){
        System.out.println(title);
        System.out.println(ingredients);

        return "meal";
    }

}


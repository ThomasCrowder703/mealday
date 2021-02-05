package com.codeup.mealday.controllers;

import com.codeup.mealday.models.Meal;
import com.codeup.mealday.repos.MealRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MealController {

    private MealRepository mealDao;

    public MealController(MealRepository mealDao){
        this.mealDao = mealDao;
    }

    @GetMapping("/create")
    public String mealPage(){

        return "meal";
    }

    @PostMapping("/create")
    @ResponseBody
    public String saveMeal(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "ingredients") String ingredients,
            @RequestParam(name = "directions", required = false) String directions,
             @RequestParam(name = "calories", required = false) String calories
            ){
//        Meal userMeal = new Meal();
//        userMeal.setTitle(title);
//        userMeal.setIngredient_list(ingredients);

        System.out.println(title);
        System.out.println(ingredients);
        System.out.println(directions);
        System.out.println(calories);



        return "meal";
    }

}


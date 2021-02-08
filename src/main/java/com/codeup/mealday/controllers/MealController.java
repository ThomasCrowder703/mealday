package com.codeup.mealday.controllers;

import com.codeup.mealday.models.Meal;
import com.codeup.mealday.models.User;
import com.codeup.mealday.repos.MealRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MealController {

    private MealRepository mealDao;

    public MealController(MealRepository mealDao){
        this.mealDao = mealDao;
    }

    @GetMapping("/create")
    public String mealPage(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        Meal userMeal = mealDao.findByUserId(user.getId());
        model.addAttribute("userMeal", userMeal.getTitle());


        return "meal";
    }

    @PostMapping("/create")
    public String saveMeal(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "ingredients") String ingredients,
            @RequestParam(name = "directions", required = false) String directions,
            @RequestParam(name = "calories", required = false) Integer calories
            ){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Meal userMeal = new Meal();
        userMeal.setTitle(title);
        userMeal.setIngredient_list(ingredients);
        userMeal.setUser(user);

        if(directions != null){
            userMeal.setDirection(directions);
        }

        if(calories != null){
            userMeal.setCalorie_intake(calories);
        }

        mealDao.save(userMeal);

        return "meal";
    }

}


package com.codeup.mealday.controllers;

import com.codeup.mealday.models.Meal;
import com.codeup.mealday.models.User;
import com.codeup.mealday.repos.MealRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MealController {

    private MealRepository mealDao;

    public MealController(MealRepository mealDao){
        this.mealDao = mealDao;
    }

    @GetMapping("/create")
    public String mealPage(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        List<Meal> userMealDb = mealDao.findByUserId(user.getId());
        ArrayList<String> userMeals = new ArrayList<>();
        for(Meal meal: userMealDb){
            userMeals.add(meal.getTitle());
        }
        model.addAttribute("userMeal", userMeals.toString().replace("[","").replace("]",""));




        return "meal";
    }

    @PostMapping("/create")
    public String saveMeal(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "ingredients") String ingredients,
            @RequestParam(name = "directions", required = false) String directions,
            @RequestParam(name = "carbs", required = false) String carbs,
            @RequestParam(name = "protein", required = false) String protein,
            @RequestParam(name = "fats", required = false) String fats
            ){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Meal userMeal = new Meal();
        userMeal.setTitle(title);
        userMeal.setIngredient_list(ingredients);
        userMeal.setUser(user);

        if(directions != null){
            userMeal.setDirection(directions);
        }

        if(carbs != null){
            userMeal.setCalorie_intake(carbs + " of carbs");
        }

        if(protein != null){
            userMeal.setCalorie_intake(protein + " of protein");
        }

        if(fats != null){
            userMeal.setCalorie_intake(fats + " of fats");
        }

        mealDao.save(userMeal);

        return "meal";
    }

}


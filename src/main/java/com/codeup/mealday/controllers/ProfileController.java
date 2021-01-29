package com.codeup.mealday.controllers;

import com.codeup.mealday.models.User;
import com.codeup.mealday.repos.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {
    private final UserRepository userDao;

    public ProfileController(UserRepository userDao){
        this.userDao = userDao;
    }

    @GetMapping("/profile/{id}")
    public String indexPage(@PathVariable int id, Model model){
        User user = userDao.findById(1);
        model.addAttribute("user", user.getUsername());
        return "profile";
    }
}

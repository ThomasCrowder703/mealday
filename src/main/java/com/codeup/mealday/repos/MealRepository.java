package com.codeup.mealday.repos;

import com.codeup.mealday.models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    Meal findByUserId(long id);
}

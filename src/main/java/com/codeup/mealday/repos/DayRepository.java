package com.codeup.mealday.repos;

import com.codeup.mealday.models.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends JpaRepository<Day, Long> {
    Day findById(long id);
}

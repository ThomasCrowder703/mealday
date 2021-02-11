package com.codeup.mealday.models;


import javax.persistence.*;

@Entity
@Table(name = "meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String ingredient_list;

    @Column()
    private String calorie_intake;

    @Column(columnDefinition = "text")
    private String direction;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn (name = "day_id")
    private Day day;


    public Meal(){};

    public Meal(long id, String ingredient_list, String calorie_intake, String direction){
        this.id = id;
        this.ingredient_list = ingredient_list;
        this.calorie_intake = calorie_intake;
        this.direction = direction;
    }

    public Meal(long id, String ingredient_list, String calorie_intake, String direction, User user, Day day,String title){
        this.id = id;
        this.ingredient_list = ingredient_list;
        this.calorie_intake = calorie_intake;
        this.direction = direction;
        this.user = user;
        this.day = day;
        this.title = title;
    }

// GET SET ID
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    GET SET INGREDIENTS
    public String getIngredient_list(){
        return ingredient_list;
    }

    public void setIngredient_list(String ingredient_list){
        this.ingredient_list = ingredient_list;
    }

//    GET SET CALORIES
    public String getCalorie_intake(){
        return calorie_intake;
    }

    public void setCalorie_intake(String calorie_intake){
        this.calorie_intake = calorie_intake;
    }

//    GET SET DIRECTIONS
    public String getDirection(){
        return direction;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

//    GET AND SET USER
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    GET SET DAY

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

//    GET SET TITLE
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}

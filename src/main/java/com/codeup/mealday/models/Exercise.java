package com.codeup.mealday.models;


import javax.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String task;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn (name = "day_id")
    private Day day;

    public Exercise(){};

    public Exercise(String task){
        this.task = task;
    }

    public Exercise(long id, String task){
        this.task = task;
        this.id = id;
    }

    public Exercise(String task, User user, Day day){
        this.task = task;
        this.user = user;
        this.day = day;
    }

//    GET AND SET ID
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask(){
        return task;
    }

    public void setTask(String task){
        this.task = task;
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


}

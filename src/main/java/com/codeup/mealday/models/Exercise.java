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

    public Exercise(){};

    public Exercise(String task){
        this.task = task;
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


}

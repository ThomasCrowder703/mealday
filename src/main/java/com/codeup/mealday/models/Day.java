package com.codeup.mealday.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "day")
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private int hour;

    @Column(nullable = false)
    private String name;


    public Day(){};

    public Day(long id, int hour, String name){
        this.id = id;
        this.hour = hour;
        this.name = name;
    }


    //    GET AND SET ID
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    GET AND SET HOUR
    public int getHour(){
        return this.hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

//    GET AND SET NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

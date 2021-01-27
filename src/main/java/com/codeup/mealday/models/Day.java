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


    public Day(){};

    public Day(long id, int hour){
        this.id = id;
        this.hour = hour;
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

}

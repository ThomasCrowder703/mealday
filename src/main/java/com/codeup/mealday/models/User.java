package com.codeup.mealday.models;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, length =100, unique = true)
    private String username;

    @Column()
    private String profilePicture;

    @Column(nullable = false)
    private String password;

    public User(){};

    public User(long id, String email, String username, String password, String profilePicture){
        this.id = id;
        this. email = email;
        this.username = username;
        this.password = password;
        this.profilePicture = profilePicture;
    }

//    SECURITY MODELS
    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

//    GET SET ID
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

//    GET SET EMAIL
    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

//    GET SET USERNAME
    public String getUsername(){
        return username;
    }
    public void setUsername(){
        this.username = username;
    }

//    GET SET PASSWORD
    public String getPassword(){
        return password;
    }

    public void setPassword(){
        this.password = password;
    }

//    GET SET PROFILEPIC
    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}

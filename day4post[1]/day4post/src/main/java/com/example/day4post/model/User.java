package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    private String password;
    private String favoriteToy;
    private int age;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public User(int id, String username, String email, String password, String favoriteToy, int age) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }
    
    public User() {
    }
}

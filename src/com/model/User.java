package com.model;

/**
 * Created by ÌìÒİ on 2018/7/6.
 */
public class User {
    int id;
    String name;
    String age;

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

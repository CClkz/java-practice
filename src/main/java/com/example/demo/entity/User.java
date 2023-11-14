package com.example.demo.entity;

public class User {
    private String name;
    private String password;

    public String getName(){
        return name;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String _password){

        this.password = _password;
    }

    @Override
    public String toString(){
        return "Use{name=" + name + ",password=" + password + "}";
    }

}

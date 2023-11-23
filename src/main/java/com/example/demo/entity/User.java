package com.example.demo.entity;

public class User {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName(){
        return username;
    }

    public void setName(String _name){
        this.username = _name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String _password){

        this.password = _password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

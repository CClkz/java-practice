package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class demo1 {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name1",required = false) String name){
        System.out.println(name);
        return "hello " + name;
    }

//    *一层目录 **多层
    @GetMapping("/hello/**")
    public String getHello1(String name) {
        return "hello ** " + name;
    }

    @GetMapping("/user/info")
    public String userinfo(){
        return "get userInfo";
    }

    @PostMapping("/hello")
    public String hello(String password, String name) {
        System.out.println("name:" + name);
        System.out.println("password:" + password);
        return "hello post";
    }

    @PostMapping("/hello1")
    public String hello(User user) {
        System.out.println(user);
        return "post /hello User";
    }

    @PostMapping("/hello2")
    public String hello2(@RequestBody User user) {
        System.out.println(user);
        return "post /hello2 User body";
    }

}

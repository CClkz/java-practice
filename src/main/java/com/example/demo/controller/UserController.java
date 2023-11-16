package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    //    根据id获取用户,接口不要带动词，比如/getUser
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id) {
        return "根据ID获取user";
    }

    @GetMapping("/user/info")
    public String userinfo() {
        return "get userInfo";
    }

    @PostMapping("/user")
    public String save(User user) {
        return "添加用户";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable int id) {
        return "根据ID删除用户";
    }
}

package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.PlusUserMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PlusUserMapper plusUserMapper;

    //    查询数据库
    @GetMapping("/user")
    public List query() {

//        List<User> list = userMapper.findAll();
        List<User> list = plusUserMapper.selectList(null);
        System.out.println("list:" + list);
        return list;
    }

    @GetMapping("/user/findAll")
    public List queryUsersWithOrder() {
        List<User> list = plusUserMapper.selectAllUserWithOrders();
        System.out.println("findAll list :" + list);
        return list;
    }

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
    public String save(@RequestBody User user) {
        System.out.println("1" + user);
        int count = plusUserMapper.insert(user);
        System.out.println("2" + user);
        if (count > 0) {
            return "添加用户成功";
        } else {
            return "添加用户失败";
        }
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable int id) {
        return "根据ID删除用户";
    }
}

package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/order")
    public List<Order> getAllOrder() {
        List<Order> list = orderMapper.selectList(null);
        return list;
    }

    @GetMapping("/order/findAll")
    public List<Order> getAllOrderWithUser() {
        List<Order> list = orderMapper.selectAllOrderWithUser();
        return list;
    }
}

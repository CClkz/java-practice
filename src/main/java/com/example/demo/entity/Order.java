package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName("t_order")
public class Order {
    /**
     * 唯一id
     */
    private Integer id;
    /**
     * 订单时间
     */
    private String time;
    /**
     * 订单总数
     */
    private int total;
    /**
     * 外键，用户id
     */
    private int uuid;

    @TableField(exist = false)
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", time=" + time +
                ", total=" + total +
                ", uuid=" + uuid +
                '}';
    }
}

package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Order;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    @Select("select * from t_order where uuid = #{id}")
    List<Order> selectByUid(int id);


    @Select("select * from t_order")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "time", property = "time"),
            @Result(column = "total", property = "total"),
            @Result(column = "uuid", property = "uuid"),
            @Result(column = "uuid", property = "user", javaType = User.class,
                    one = @One(select = "com.example.demo.mapper.PlusUserMapper.selectById"))
    })
    List<Order> selectAllOrderWithUser();

}

package com.roro.msproviderorder.dao;

import com.roro.msproviderorder.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDao {
    @Select("select * from orders where user_id=#{userId}")
    List<Order> queryOrdersByUserId(Integer userId);
}

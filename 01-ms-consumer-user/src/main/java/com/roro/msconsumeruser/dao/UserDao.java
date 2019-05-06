package com.roro.msconsumeruser.dao;

import com.roro.msconsumeruser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserDao {

    @Select("select * from user where user_id=#{userId}")
    User queryUserById(Integer userId);
}

package com.roro.msconsumeruser.service;

import com.roro.msconsumeruser.dao.UserDao;
import com.roro.msconsumeruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao;

    public User queryUserById(Integer userId){
        return userDao.queryUserById(userId);
    }
}

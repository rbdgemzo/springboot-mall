package com.rbdgemzo.springbootmall.service.impl;

import com.rbdgemzo.springbootmall.dao.UserDao;
import com.rbdgemzo.springbootmall.dto.UserRegisterRequest;
import com.rbdgemzo.springbootmall.model.User;
import com.rbdgemzo.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}

package com.rbdgemzo.springbootmall.service;

import com.rbdgemzo.springbootmall.dto.UserLoginRequest;
import com.rbdgemzo.springbootmall.dto.UserRegisterRequest;
import com.rbdgemzo.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}

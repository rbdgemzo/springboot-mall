package com.rbdgemzo.springbootmall.dao;

import com.rbdgemzo.springbootmall.dto.UserRegisterRequest;
import com.rbdgemzo.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

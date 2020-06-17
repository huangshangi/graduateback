/*
 * Copyright (c) 2020
 * Date:2020/06/17 08:18:17
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.User;
import com.sdu.graduateback.mapper.UserMapper;
import com.sdu.graduateback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User getUserByToken(String token) {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User getUserByOpenid(String openid) {
        return null;
    }

    @Override
    public int verifyUser(String id, String pass) {
        return 0;
    }

    @Override
    public String getTokenByOpenid(String openid) {
        return null;
    }

    @Override
    public String getIdByToken(String token) {
        return null;
    }

    @Override
    public int verifyUser(String openid) {
        return 0;
    }

    @Override
    public int updateOpenid(String openid, String id) {
        return 0;
    }

    @Override
    public int updateToken(String token, String id) {
        return 0;
    }

    @Override
    public int updateOpenIdByToken(String openId, String token) {
        return 0;
    }

    @Override
    public int updateUser(User user, String id) {
        return 0;
    }
}

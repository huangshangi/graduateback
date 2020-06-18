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

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser(User user) {

        return userMapper.addUser(user);
    }

    @Override
    public User getUserByToken(String token) {
        return userMapper.getUserByToken(token);
    }

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByOpenid(String openid) {
        return userMapper.getUserByOpenid(openid);
    }

    @Override
    public int verifyUser(String id, String pass) {

        return userMapper.login(id,pass);
    }

    @Override
    public String getTokenByOpenid(String openid) {
        return userMapper.getUserByOpenid(openid).getToken();
    }

    @Override
    public String getIdByToken(String token) {
        return userMapper.getUserByToken(token).getU();
    }

    @Override
    public int verifyUser(String openid) {
        return userMapper.verifyOpenid(openid);
    }

    @Override
    public int updateOpenid(String openid, String id) {
        return userMapper.updateOpenid(openid,id);
    }

    @Override
    public int updateToken(String token, String id) {
        return userMapper.updateToken(token, id);
    }

    @Override
    public int updateOpenIdByToken(String openId, String token) {
        return userMapper.updateOpenIdByToken(openId, token);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public String getIdByOpenid(String openid) {
        return userMapper.getUserByOpenid(openid).getU();
    }
}

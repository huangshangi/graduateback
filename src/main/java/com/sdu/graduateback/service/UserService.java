/*
 * Copyright (c) 2020
 * Date:2020/06/12 08:52:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.User;

public interface UserService {

    //向user表中添加
    User addUser(User user);

    //根据token查询用户
    User getUserByToken(String token);

    //根据用户id查询用户信息
    User getUserById(String id);

    //根据openid查询用户信息
    User getUserByOpenid(String openid);

    //验证数据库中是否存在该字段
    int verifyUser(String id,String pass);

    String getTokenByOpenid(String openid);

    String getIdByToken(String token);

    int verifyUser(String openid);

    int updateOpenid(String openid,String id);

    int updateToken(String token,String id);

    int updateOpenIdByToken(String openId,String token);

    int updateUser(User user);

    User userUnbindPack(User user);

}

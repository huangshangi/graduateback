/*
 * Copyright (c) 2020
 * Date:2020/06/12 11:15:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface UserMapper {


    int login(@Param(value = "id") String id,@Param(value = "pass") String pass);

    int addUser(User user);


    User getUserByToken(String token);


    User getUserById(String id);


    User getUserByOpenid(String openid);

    //确定存在该字段
    int verifyOpenid(String openid);

    int updateOpenid(String openid, String id);

    int updateToken(String token, String id);

    int updateOpenIdByToken(String openId, String token);

    int updateUser(User user);
}

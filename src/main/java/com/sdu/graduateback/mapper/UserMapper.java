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


    User login(@Param(value = "id") String id,@Param(value = "pass") String pass);

}

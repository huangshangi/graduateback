/*
 * Copyright (c) 2020
 * Date:2020/06/18 20:24:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.GoAbroad;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoAbroadMapper {

    GoAbroad getGoAbroadById(String id);
    int insertGoAbroad(GoAbroad goAbroad);
}

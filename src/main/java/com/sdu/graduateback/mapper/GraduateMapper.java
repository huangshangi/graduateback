/*
 * Copyright (c) 2020
 * Date:2020/06/18 18:01:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Graduate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GraduateMapper {

    Graduate getGraduateById(String id);

    int updateGraduateById(Graduate graduate);

    int addGraduate(Graduate graduate);

    int deleteGraduate(Graduate graduate);

    int updateGraduateByGType(String id,String type,String value);

    int updateGraduateByAType(String id,String type,String value);

    int updateGraduateByTType(String id,String value);

}

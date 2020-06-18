/*
 * Copyright (c) 2020
 * Date:2020/06/18 18:01:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Graduate;

public interface GraduateMapper {

    Graduate getGraduateById(String id);

    int updateGraduateById(Graduate graduate);

}

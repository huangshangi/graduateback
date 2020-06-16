/*
 * Copyright (c) 2020
 * Date:2020/06/16 13:21:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Graduate;

public interface GraduateService {

    int addGraduate(Graduate graduate);

    int deleteGraduate(Graduate graduate);

    int updateGraduate(Graduate graduate);

    int updateGraduateByType(String id,String type,String value);

}

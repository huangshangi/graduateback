/*
 * Copyright (c) 2020
 * Date:2020/06/12 12:06:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Recurit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecuritMapper {

    Recurit getRecuritById(String id);

    Recurit getRecuritByScAndSt(String sc,String st);
}

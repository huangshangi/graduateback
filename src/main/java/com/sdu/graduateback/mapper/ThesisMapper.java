/*
 * Copyright (c) 2020
 * Date:2020/06/18 17:31:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Thesis;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Mapper
public interface ThesisMapper {
    int addThesis(Thesis thesis);

    int deleteThesis(Thesis thesis);

    int updateThesis(Thesis thesis);

    Thesis getThesisById(String id);
}

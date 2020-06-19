/*
 * Copyright (c) 2020
 * Date:2020/06/18 17:31:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Thesis;

import java.util.List;

public interface ThesisMapper {
    int addThesis(Thesis thesis);

    int deleteThesis(Thesis thesis);

    int updateThesis(Thesis thesis);

    Thesis getThesisById(String id);
}

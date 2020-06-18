/*
 * Copyright (c) 2020
 * Date:2020/06/18 17:30:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Thesis;
import com.sdu.graduateback.mapper.ThesisMapper;
import com.sdu.graduateback.service.ThesisService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThesisServiceImpl implements ThesisService {

    @Autowired
    ThesisMapper thesisMapper;

    @Override
    public int addThesis(Thesis thesis) {
        return 0;
    }

    @Override
    public int deleteThesis(Thesis thesis) {
        return 0;
    }

    @Override
    public int updateThesis(Thesis thesis) {
        return 0;
    }

    @Override
    public List<Thesis> getThesisByTeacherId(String id) {
        return thesisMapper.getThesisByTeacherId(id);
    }

    @Override
    public Object thesisPack(List<Thesis> list) {

        Map<String,Object> map=new HashMap<>();

        return null;

    }
}

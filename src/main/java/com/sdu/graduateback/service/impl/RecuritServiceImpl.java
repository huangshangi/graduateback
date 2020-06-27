/*
 * Copyright (c) 2020
 * Date:2020/06/18 14:49:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Recurit;
import com.sdu.graduateback.mapper.RecuritMapper;
import com.sdu.graduateback.service.RecuritService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecuritServiceImpl implements RecuritService {

    @Autowired
    RecuritMapper recuritMapper;
    @Override
    public Recurit getRecuritById(String id) {
        return recuritMapper.getRecuritById(id);
    }

    @Override
    public Recurit getRecuritByScAndSt(String sc, String st) {
        return recuritMapper.getRecuritByScAndSt(sc, st);
    }
}

/*
 * Copyright (c) 2020
 * Date:2020/06/18 21:58:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Award;
import com.sdu.graduateback.mapper.AwardMapper;
import com.sdu.graduateback.service.AwardService;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AwardServiceImpl implements AwardService {

    AwardMapper awardMapper;

    @Override
    public List<Award> getAwards(String personId) {
        return awardMapper.getAwards(personId);
    }

    @Override
    public Award getAwardById(String id) {
        return awardMapper.getAwardById(id);
    }

    @Override
    public Award packAward(Award oldA, Award newA) {

        if(!StringUtil.isEmpty(oldA.getD()))
            newA.setD(oldA.getD());

        if(!StringUtil.isEmpty(oldA.getT()))
            newA.setT(oldA.getT());

        if(!StringUtil.isEmpty(oldA.getN()))
            newA.setN(oldA.getN());

        return newA;
    }

    @Override
    public int updateAward(Award award) {
        return awardMapper.updateAward(award);
    }
}

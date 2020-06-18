/*
 * Copyright (c) 2020
 * Date:2020/06/18 21:39:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Award;

import java.util.List;

public interface AwardService {

    List<Award>getAwards(String personId);


    Award getAwardById(String id);

    Award packAward(Award oldA,Award newA);

    int updateAward(Award award);

}

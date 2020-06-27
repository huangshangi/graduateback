/*
 * Copyright (c) 2020
 * Date:2020/06/18 21:39:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Award;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AwardService {

    List<Award>getAwards(String personId);

    List<Award>getAwardsbyType(String personId,String type);

    Award getAwardById(String id);

    Award packAward(Award oldA,Award newA);

    int updateAward(Award award);

}
